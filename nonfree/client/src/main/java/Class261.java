import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!on")
public final class Class261 {

	@OriginalMember(owner = "client!on", name = "l", descriptor = "[B")
	public static final byte[] aByteArray71 = new byte[32896];

	@OriginalMember(owner = "client!on", name = "c", descriptor = "Lclient!rg;")
	private Class2_Sub7 aClass2_Sub7_38;

	@OriginalMember(owner = "client!on", name = "h", descriptor = "J")
	private long aLong182;

	@OriginalMember(owner = "client!on", name = "j", descriptor = "I")
	private final int anInt6973;

	@OriginalMember(owner = "client!on", name = "a", descriptor = "[Lclient!rg;")
	private final Class2_Sub7[] aClass2_Sub7Array1;

	static {
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < 256; local20++) {
			for (@Pc(23) int local23 = 0; local23 <= local20; local23++) {
				aByteArray71[local18++] = (byte) (int) (255.0D / Math.sqrt((double) ((float) (local23 * local23 + local20 * local20 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!on", name = "<init>", descriptor = "(I)V")
	public Class261(@OriginalArg(0) int arg0) {
		this.anInt6973 = arg0;
		this.aClass2_Sub7Array1 = new Class2_Sub7[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class2_Sub7 local20 = this.aClass2_Sub7Array1[local10] = new Class2_Sub7();
			local20.aClass2_Sub7_67 = local20;
			local20.aClass2_Sub7_66 = local20;
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(JILclient!rg;)V")
	public void method6092(@OriginalArg(0) long arg0, @OriginalArg(2) Class2_Sub7 arg1) {
		if (arg1.aClass2_Sub7_67 != null) {
			arg1.method8504();
		}
		@Pc(29) Class2_Sub7 local29 = this.aClass2_Sub7Array1[(int) ((long) (this.anInt6973 - 1) & arg0)];
		arg1.aClass2_Sub7_66 = local29;
		arg1.aClass2_Sub7_67 = local29.aClass2_Sub7_67;
		arg1.aClass2_Sub7_67.aClass2_Sub7_66 = arg1;
		arg1.aClass2_Sub7_66.aClass2_Sub7_67 = arg1;
		arg1.aLong260 = arg0;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(I)Lclient!rg;")
	public Class2_Sub7 method6097() {
		if (this.aClass2_Sub7_38 == null) {
			return null;
		}
		@Pc(29) Class2_Sub7 local29 = this.aClass2_Sub7Array1[(int) (this.aLong182 & (long) (this.anInt6973 - 1))];
		while (this.aClass2_Sub7_38 != local29) {
			if (this.aClass2_Sub7_38.aLong260 == this.aLong182) {
				@Pc(45) Class2_Sub7 local45 = this.aClass2_Sub7_38;
				this.aClass2_Sub7_38 = this.aClass2_Sub7_38.aClass2_Sub7_66;
				return local45;
			}
			this.aClass2_Sub7_38 = this.aClass2_Sub7_38.aClass2_Sub7_66;
		}
		this.aClass2_Sub7_38 = null;
		return null;
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(JI)Lclient!rg;")
	public Class2_Sub7 method6098(@OriginalArg(0) long arg0) {
		this.aLong182 = arg0;
		@Pc(20) Class2_Sub7 local20 = this.aClass2_Sub7Array1[(int) ((long) (this.anInt6973 - 1) & arg0)];
		for (this.aClass2_Sub7_38 = local20.aClass2_Sub7_66; this.aClass2_Sub7_38 != local20; this.aClass2_Sub7_38 = this.aClass2_Sub7_38.aClass2_Sub7_66) {
			if (arg0 == this.aClass2_Sub7_38.aLong260) {
				@Pc(39) Class2_Sub7 local39 = this.aClass2_Sub7_38;
				this.aClass2_Sub7_38 = this.aClass2_Sub7_38.aClass2_Sub7_66;
				return local39;
			}
		}
		this.aClass2_Sub7_38 = null;
		return null;
	}
}
