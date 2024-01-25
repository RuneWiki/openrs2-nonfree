import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vha")
public final class Class353 {

	@OriginalMember(owner = "client!vha", name = "d", descriptor = "J")
	private long aLong264;

	@OriginalMember(owner = "client!vha", name = "f", descriptor = "Lclient!ob;")
	private Class3_Sub7 aClass3_Sub7_65;

	@OriginalMember(owner = "client!vha", name = "b", descriptor = "I")
	private final int anInt9752;

	@OriginalMember(owner = "client!vha", name = "k", descriptor = "[Lclient!ob;")
	private final Class3_Sub7[] aClass3_Sub7Array1;

	@OriginalMember(owner = "client!vha", name = "<init>", descriptor = "(I)V")
	public Class353(@OriginalArg(0) int arg0) {
		this.anInt9752 = arg0;
		this.aClass3_Sub7Array1 = new Class3_Sub7[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class3_Sub7 local20 = this.aClass3_Sub7Array1[local10] = new Class3_Sub7();
			local20.aClass3_Sub7_64 = local20;
			local20.aClass3_Sub7_63 = local20;
		}
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(JZ)Lclient!ob;")
	public Class3_Sub7 method8294(@OriginalArg(0) long arg0) {
		this.aLong264 = arg0;
		@Pc(20) Class3_Sub7 local20 = this.aClass3_Sub7Array1[(int) ((long) (this.anInt9752 - 1) & arg0)];
		for (this.aClass3_Sub7_65 = local20.aClass3_Sub7_63; this.aClass3_Sub7_65 != local20; this.aClass3_Sub7_65 = this.aClass3_Sub7_65.aClass3_Sub7_63) {
			if (arg0 == this.aClass3_Sub7_65.aLong251) {
				@Pc(40) Class3_Sub7 local40 = this.aClass3_Sub7_65;
				this.aClass3_Sub7_65 = this.aClass3_Sub7_65.aClass3_Sub7_63;
				return local40;
			}
		}
		this.aClass3_Sub7_65 = null;
		return null;
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(B)Lclient!ob;")
	public Class3_Sub7 method8295() {
		if (this.aClass3_Sub7_65 == null) {
			return null;
		}
		@Pc(28) Class3_Sub7 local28 = this.aClass3_Sub7Array1[(int) (this.aLong264 & (long) (this.anInt9752 - 1))];
		while (this.aClass3_Sub7_65 != local28) {
			if (this.aClass3_Sub7_65.aLong251 == this.aLong264) {
				@Pc(44) Class3_Sub7 local44 = this.aClass3_Sub7_65;
				this.aClass3_Sub7_65 = this.aClass3_Sub7_65.aClass3_Sub7_63;
				return local44;
			}
			this.aClass3_Sub7_65 = this.aClass3_Sub7_65.aClass3_Sub7_63;
		}
		this.aClass3_Sub7_65 = null;
		return null;
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(JLclient!ob;B)V")
	public void method8296(@OriginalArg(0) long arg0, @OriginalArg(1) Class3_Sub7 arg1) {
		if (arg1.aClass3_Sub7_64 != null) {
			arg1.method7907();
		}
		@Pc(32) Class3_Sub7 local32 = this.aClass3_Sub7Array1[(int) ((long) (this.anInt9752 - 1) & arg0)];
		arg1.aClass3_Sub7_63 = local32;
		arg1.aClass3_Sub7_64 = local32.aClass3_Sub7_64;
		arg1.aClass3_Sub7_64.aClass3_Sub7_63 = arg1;
		arg1.aLong251 = arg0;
		arg1.aClass3_Sub7_63.aClass3_Sub7_64 = arg1;
	}
}
