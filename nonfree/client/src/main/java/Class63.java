import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
public class Class63 implements Interface3 {

	@OriginalMember(owner = "client!gj", name = "n", descriptor = "Lclient!ta;")
	private Class162 aClass162_10 = new Class162(256);

	@OriginalMember(owner = "client!gj", name = "l", descriptor = "Lclient!th;")
	private Class168 aClass168_203;

	@OriginalMember(owner = "client!gj", name = "g", descriptor = "Lclient!th;")
	private Class168 aClass168_202;

	@OriginalMember(owner = "client!gj", name = "d", descriptor = "[Lclient!jd;")
	private Class85[] aClass85Array2;

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lclient!th;Lclient!th;Lclient!th;)V")
	protected Class63(@OriginalArg(0) Class168 arg0, @OriginalArg(1) Class168 arg1, @OriginalArg(2) Class168 arg2) {
		this.aClass168_203 = arg1;
		this.aClass168_202 = arg2;
		@Pc(24) Class1_Sub14 local24 = new Class1_Sub14(arg0.method4058(0, 0));
		@Pc(28) int local28 = local24.method2244();
		this.aClass85Array2 = new Class85[local28];
		@Pc(34) int local34;
		for (local34 = 0; local34 < local28; local34++) {
			if (local24.method2199() == 1) {
				this.aClass85Array2[local34] = new Class85();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass85Array2[local34] != null) {
				this.aClass85Array2[local34].aBoolean167 = local24.method2199() == 0;
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass85Array2[local34] != null) {
				this.aClass85Array2[local34].aBoolean166 = local24.method2199() == 1;
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass85Array2[local34] != null) {
				this.aClass85Array2[local34].aBoolean169 = local24.method2199() == 1;
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass85Array2[local34] != null) {
				this.aClass85Array2[local34].aBoolean168 = local24.method2199() == 1;
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass85Array2[local34] != null) {
				this.aClass85Array2[local34].aByte11 = local24.method2212();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass85Array2[local34] != null) {
				this.aClass85Array2[local34].aByte12 = local24.method2212();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass85Array2[local34] != null) {
				this.aClass85Array2[local34].aByte9 = local24.method2212();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass85Array2[local34] != null) {
				this.aClass85Array2[local34].aByte10 = local24.method2212();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass85Array2[local34] != null) {
				this.aClass85Array2[local34].aShort50 = (short) local24.method2244();
			}
		}
		if (local24.anInt3000 < local24.aByteArray55.length) {
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass85Array2[local34] != null) {
					local24.method2212();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass85Array2[local34] != null) {
					local24.method2212();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass85Array2[local34] != null) {
					local24.method2199();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass85Array2[local34] != null) {
					this.aClass85Array2[local34].aBoolean165 = local24.method2199() == 1;
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass85Array2[local34] != null) {
					local24.method2212();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass85Array2[local34] != null) {
					local24.method2199();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass85Array2[local34] != null) {
					local24.method2199();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass85Array2[local34] != null) {
					local24.method2199();
				}
			}
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIZIFI)[I")
	@Override
	public final int[] method4586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3) {
		return this.method4588(arg0).method2032(this, arg2, this.aClass85Array2[arg0].aBoolean165, arg1, (double) arg3, false, this.aClass168_202);
	}

	@OriginalMember(owner = "client!gj", name = "i", descriptor = "(II)Lclient!jb;")
	protected Class1_Sub3_Sub9 method4588(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub3 local10 = this.aClass162_10.method4003((long) arg0);
		if (local10 != null) {
			return (Class1_Sub3_Sub9) local10;
		}
		@Pc(29) byte[] local29 = this.aClass168_203.method4062(arg0);
		if (local29 == null) {
			return null;
		} else {
			@Pc(42) Class1_Sub3_Sub9 local42 = new Class1_Sub3_Sub9(new Class1_Sub14(local29));
			this.aClass162_10.method4005(local42, (long) arg0);
			return local42;
		}
	}

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "(IB)Lclient!jd;")
	@Override
	public final Class85 method4585(@OriginalArg(0) int arg0) {
		return this.aClass85Array2[arg0];
	}

	@OriginalMember(owner = "client!gj", name = "h", descriptor = "(II)Z")
	@Override
	public final boolean method4584(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub3_Sub9 local8 = this.method4588(arg0);
		return local8 != null && local8.method2039(this, this.aClass168_202);
	}
}
