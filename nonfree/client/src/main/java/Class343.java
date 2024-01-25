import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ts")
public final class Class343 {

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "Lclient!ww;")
	private Class2_Sub2 aClass2_Sub2_61;

	@OriginalMember(owner = "client!ts", name = "j", descriptor = "J")
	private long aLong241;

	@OriginalMember(owner = "client!ts", name = "i", descriptor = "I")
	private final int anInt9104;

	@OriginalMember(owner = "client!ts", name = "g", descriptor = "[Lclient!ww;")
	private final Class2_Sub2[] aClass2_Sub2Array1;

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(I)V")
	public Class343(@OriginalArg(0) int arg0) {
		this.anInt9104 = arg0;
		this.aClass2_Sub2Array1 = new Class2_Sub2[arg0];
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class2_Sub2 local20 = this.aClass2_Sub2Array1[local10] = new Class2_Sub2();
			local20.aClass2_Sub2_66 = local20;
			local20.aClass2_Sub2_67 = local20;
		}
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IJ)Lclient!ww;")
	public Class2_Sub2 method7638(@OriginalArg(1) long arg0) {
		this.aLong241 = arg0;
		@Pc(20) Class2_Sub2 local20 = this.aClass2_Sub2Array1[(int) (arg0 & (long) (this.anInt9104 - 1))];
		for (this.aClass2_Sub2_61 = local20.aClass2_Sub2_67; this.aClass2_Sub2_61 != local20; this.aClass2_Sub2_61 = this.aClass2_Sub2_61.aClass2_Sub2_67) {
			if (this.aClass2_Sub2_61.aLong269 == arg0) {
				@Pc(40) Class2_Sub2 local40 = this.aClass2_Sub2_61;
				this.aClass2_Sub2_61 = this.aClass2_Sub2_61.aClass2_Sub2_67;
				return local40;
			}
		}
		this.aClass2_Sub2_61 = null;
		return null;
	}

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(BLclient!ww;J)V")
	public void method7641(@OriginalArg(1) Class2_Sub2 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass2_Sub2_66 != null) {
			arg0.method8271();
		}
		@Pc(21) Class2_Sub2 local21 = this.aClass2_Sub2Array1[(int) (arg1 & (long) (this.anInt9104 - 1))];
		arg0.aClass2_Sub2_67 = local21;
		arg0.aClass2_Sub2_66 = local21.aClass2_Sub2_66;
		arg0.aClass2_Sub2_66.aClass2_Sub2_67 = arg0;
		arg0.aClass2_Sub2_67.aClass2_Sub2_66 = arg0;
		arg0.aLong269 = arg1;
	}

	@OriginalMember(owner = "client!ts", name = "d", descriptor = "(I)Lclient!ww;")
	public Class2_Sub2 method7647() {
		if (this.aClass2_Sub2_61 == null) {
			return null;
		}
		@Pc(23) Class2_Sub2 local23 = this.aClass2_Sub2Array1[(int) (this.aLong241 & (long) (this.anInt9104 - 1))];
		while (local23 != this.aClass2_Sub2_61) {
			if (this.aLong241 == this.aClass2_Sub2_61.aLong269) {
				@Pc(39) Class2_Sub2 local39 = this.aClass2_Sub2_61;
				this.aClass2_Sub2_61 = this.aClass2_Sub2_61.aClass2_Sub2_67;
				return local39;
			}
			this.aClass2_Sub2_61 = this.aClass2_Sub2_61.aClass2_Sub2_67;
		}
		this.aClass2_Sub2_61 = null;
		return null;
	}
}
