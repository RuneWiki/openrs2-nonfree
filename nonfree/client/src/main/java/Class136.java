import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hp")
public final class Class136 {

	@OriginalMember(owner = "client!hp", name = "e", descriptor = "Lclient!lha;")
	private Class8_Sub5 aClass8_Sub5_28;

	@OriginalMember(owner = "client!hp", name = "o", descriptor = "J")
	private long aLong123;

	@OriginalMember(owner = "client!hp", name = "c", descriptor = "[Lclient!lha;")
	private final Class8_Sub5[] aClass8_Sub5Array1;

	@OriginalMember(owner = "client!hp", name = "n", descriptor = "I")
	private final int anInt4966;

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(I)V")
	public Class136(@OriginalArg(0) int arg0) {
		this.aClass8_Sub5Array1 = new Class8_Sub5[arg0];
		this.anInt4966 = arg0;
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class8_Sub5 local20 = this.aClass8_Sub5Array1[local10] = new Class8_Sub5();
			local20.aClass8_Sub5_66 = local20;
			local20.aClass8_Sub5_67 = local20;
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)Lclient!lha;")
	public Class8_Sub5 method4041() {
		if (this.aClass8_Sub5_28 == null) {
			return null;
		}
		@Pc(23) Class8_Sub5 local23 = this.aClass8_Sub5Array1[(int) ((long) (this.anInt4966 - 1) & this.aLong123)];
		while (local23 != this.aClass8_Sub5_28) {
			if (this.aClass8_Sub5_28.aLong275 == this.aLong123) {
				@Pc(40) Class8_Sub5 local40 = this.aClass8_Sub5_28;
				this.aClass8_Sub5_28 = this.aClass8_Sub5_28.aClass8_Sub5_66;
				return local40;
			}
			this.aClass8_Sub5_28 = this.aClass8_Sub5_28.aClass8_Sub5_66;
		}
		this.aClass8_Sub5_28 = null;
		return null;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(BJLclient!lha;)V")
	public void method4043(@OriginalArg(1) long arg0, @OriginalArg(2) Class8_Sub5 arg1) {
		if (arg1.aClass8_Sub5_67 != null) {
			arg1.method8381();
		}
		@Pc(21) Class8_Sub5 local21 = this.aClass8_Sub5Array1[(int) (arg0 & (long) (this.anInt4966 - 1))];
		arg1.aClass8_Sub5_66 = local21;
		arg1.aClass8_Sub5_67 = local21.aClass8_Sub5_67;
		arg1.aClass8_Sub5_67.aClass8_Sub5_66 = arg1;
		arg1.aLong275 = arg0;
		arg1.aClass8_Sub5_66.aClass8_Sub5_67 = arg1;
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IJ)Lclient!lha;")
	public Class8_Sub5 method4046(@OriginalArg(1) long arg0) {
		this.aLong123 = arg0;
		@Pc(20) Class8_Sub5 local20 = this.aClass8_Sub5Array1[(int) (arg0 & (long) (this.anInt4966 - 1))];
		for (this.aClass8_Sub5_28 = local20.aClass8_Sub5_66; this.aClass8_Sub5_28 != local20; this.aClass8_Sub5_28 = this.aClass8_Sub5_28.aClass8_Sub5_66) {
			if (this.aClass8_Sub5_28.aLong275 == arg0) {
				@Pc(39) Class8_Sub5 local39 = this.aClass8_Sub5_28;
				this.aClass8_Sub5_28 = this.aClass8_Sub5_28.aClass8_Sub5_66;
				return local39;
			}
		}
		this.aClass8_Sub5_28 = null;
		return null;
	}
}
