import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class237 {

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "J")
	private long aLong209;

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "Lclient!gk;")
	private Class5_Sub2 aClass5_Sub2_55;

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "[Lclient!gk;")
	private final Class5_Sub2[] aClass5_Sub2Array1;

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
	private final int anInt6784;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(I)V")
	public Class237(@OriginalArg(0) int arg0) {
		this.aClass5_Sub2Array1 = new Class5_Sub2[arg0];
		this.anInt6784 = arg0;
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class5_Sub2 local20 = this.aClass5_Sub2Array1[local10] = new Class5_Sub2();
			local20.aClass5_Sub2_57 = local20;
			local20.aClass5_Sub2_58 = local20;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(JI)Lclient!gk;")
	public Class5_Sub2 method5364(@OriginalArg(0) long arg0) {
		this.aLong209 = arg0;
		@Pc(28) Class5_Sub2 local28 = this.aClass5_Sub2Array1[(int) ((long) (this.anInt6784 - 1) & arg0)];
		for (this.aClass5_Sub2_55 = local28.aClass5_Sub2_58; this.aClass5_Sub2_55 != local28; this.aClass5_Sub2_55 = this.aClass5_Sub2_55.aClass5_Sub2_58) {
			if (this.aClass5_Sub2_55.aLong235 == arg0) {
				@Pc(43) Class5_Sub2 local43 = this.aClass5_Sub2_55;
				this.aClass5_Sub2_55 = this.aClass5_Sub2_55.aClass5_Sub2_58;
				return local43;
			}
		}
		this.aClass5_Sub2_55 = null;
		return null;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILclient!gk;J)V")
	public void method5365(@OriginalArg(1) Class5_Sub2 arg0, @OriginalArg(2) long arg1) {
		if (arg0.aClass5_Sub2_57 != null) {
			arg0.method6006();
		}
		@Pc(21) Class5_Sub2 local21 = this.aClass5_Sub2Array1[(int) ((long) (this.anInt6784 - 1) & arg1)];
		arg0.aClass5_Sub2_57 = local21.aClass5_Sub2_57;
		arg0.aClass5_Sub2_58 = local21;
		arg0.aClass5_Sub2_57.aClass5_Sub2_58 = arg0;
		arg0.aClass5_Sub2_58.aClass5_Sub2_57 = arg0;
		arg0.aLong235 = arg1;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)Lclient!gk;")
	public Class5_Sub2 method5366() {
		if (this.aClass5_Sub2_55 == null) {
			return null;
		}
		@Pc(23) Class5_Sub2 local23 = this.aClass5_Sub2Array1[(int) (this.aLong209 & (long) (this.anInt6784 - 1))];
		while (local23 != this.aClass5_Sub2_55) {
			if (this.aLong209 == this.aClass5_Sub2_55.aLong235) {
				@Pc(35) Class5_Sub2 local35 = this.aClass5_Sub2_55;
				this.aClass5_Sub2_55 = this.aClass5_Sub2_55.aClass5_Sub2_58;
				return local35;
			}
			this.aClass5_Sub2_55 = this.aClass5_Sub2_55.aClass5_Sub2_58;
		}
		this.aClass5_Sub2_55 = null;
		return null;
	}
}
