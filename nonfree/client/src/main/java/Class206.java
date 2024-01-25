import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lba")
public final class Class206 {

	@OriginalMember(owner = "client!lba", name = "i", descriptor = "Lclient!al;")
	private Class14_Sub3 aClass14_Sub3_36;

	@OriginalMember(owner = "client!lba", name = "j", descriptor = "J")
	private long aLong167;

	@OriginalMember(owner = "client!lba", name = "d", descriptor = "[Lclient!al;")
	private final Class14_Sub3[] aClass14_Sub3Array1;

	@OriginalMember(owner = "client!lba", name = "f", descriptor = "I")
	private final int anInt6119;

	@OriginalMember(owner = "client!lba", name = "<init>", descriptor = "(I)V")
	public Class206(@OriginalArg(0) int arg0) {
		this.aClass14_Sub3Array1 = new Class14_Sub3[arg0];
		this.anInt6119 = arg0;
		for (@Pc(10) int local10 = 0; local10 < arg0; local10++) {
			@Pc(20) Class14_Sub3 local20 = this.aClass14_Sub3Array1[local10] = new Class14_Sub3();
			local20.aClass14_Sub3_67 = local20;
			local20.aClass14_Sub3_66 = local20;
		}
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(Z)Lclient!al;")
	public Class14_Sub3 method5085() {
		if (this.aClass14_Sub3_36 == null) {
			return null;
		}
		@Pc(28) Class14_Sub3 local28 = this.aClass14_Sub3Array1[(int) (this.aLong167 & (long) (this.anInt6119 - 1))];
		while (this.aClass14_Sub3_36 != local28) {
			if (this.aLong167 == this.aClass14_Sub3_36.aLong302) {
				@Pc(40) Class14_Sub3 local40 = this.aClass14_Sub3_36;
				this.aClass14_Sub3_36 = this.aClass14_Sub3_36.aClass14_Sub3_67;
				return local40;
			}
			this.aClass14_Sub3_36 = this.aClass14_Sub3_36.aClass14_Sub3_67;
		}
		this.aClass14_Sub3_36 = null;
		return null;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(JI)Lclient!al;")
	public Class14_Sub3 method5086(@OriginalArg(0) long arg0) {
		this.aLong167 = arg0;
		@Pc(27) Class14_Sub3 local27 = this.aClass14_Sub3Array1[(int) ((long) (this.anInt6119 - 1) & arg0)];
		for (this.aClass14_Sub3_36 = local27.aClass14_Sub3_67; this.aClass14_Sub3_36 != local27; this.aClass14_Sub3_36 = this.aClass14_Sub3_36.aClass14_Sub3_67) {
			if (arg0 == this.aClass14_Sub3_36.aLong302) {
				@Pc(46) Class14_Sub3 local46 = this.aClass14_Sub3_36;
				this.aClass14_Sub3_36 = this.aClass14_Sub3_36.aClass14_Sub3_67;
				return local46;
			}
		}
		this.aClass14_Sub3_36 = null;
		return null;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(JLclient!al;B)V")
	public void method5087(@OriginalArg(0) long arg0, @OriginalArg(1) Class14_Sub3 arg1) {
		if (arg1.aClass14_Sub3_66 != null) {
			arg1.method9253();
		}
		@Pc(21) Class14_Sub3 local21 = this.aClass14_Sub3Array1[(int) (arg0 & (long) (this.anInt6119 - 1))];
		arg1.aClass14_Sub3_66 = local21.aClass14_Sub3_66;
		arg1.aClass14_Sub3_67 = local21;
		arg1.aClass14_Sub3_66.aClass14_Sub3_67 = arg1;
		arg1.aLong302 = arg0;
		arg1.aClass14_Sub3_67.aClass14_Sub3_66 = arg1;
	}
}
