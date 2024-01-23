import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public final class Class1_Sub1_Sub15 extends Class1_Sub1 {

	@OriginalMember(owner = "client!mi", name = "I", descriptor = "I")
	public int anInt2783;

	@OriginalMember(owner = "client!mi", name = "M", descriptor = "I")
	private int anInt2785;

	@OriginalMember(owner = "client!mi", name = "O", descriptor = "I")
	public int anInt2787;

	@OriginalMember(owner = "client!mi", name = "W", descriptor = "Lclient!ff;")
	private Class33 aClass33_8;

	@OriginalMember(owner = "client!mi", name = "J", descriptor = "Lclient!kh;")
	private Class60 aClass60_949 = Static56.aClass60_452;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)Lclient!kh;")
	public Class60 method2118(@OriginalArg(0) int arg0) {
		if (this.aClass33_8 == null) {
			return this.aClass60_949;
		} else {
			@Pc(17) Class1_Sub6 local17 = (Class1_Sub6) this.aClass33_8.method1071((long) arg0);
			return local17 == null ? this.aClass60_949 : local17.aClass60_251;
		}
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(II)I")
	public int method2121(@OriginalArg(1) int arg0) {
		if (this.aClass33_8 == null) {
			return this.anInt2785;
		} else {
			@Pc(22) Class1_Sub16 local22 = (Class1_Sub16) this.aClass33_8.method1071((long) arg0);
			return local22 == null ? this.anInt2785 : local22.anInt2543;
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!nc;II)V")
	private void method2123(@OriginalArg(0) Class1_Sub9 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt2787 = arg0.method895();
		} else if (arg1 == 2) {
			this.anInt2783 = arg0.method895();
		} else if (arg1 == 3) {
			this.aClass60_949 = arg0.method935();
		} else if (arg1 == 4) {
			this.anInt2785 = arg0.method915();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(57) int local57 = arg0.method946();
			this.aClass33_8 = new Class33(Static61.method1102(local57));
			for (@Pc(67) int local67 = 0; local67 < local57; local67++) {
				@Pc(73) int local73 = arg0.method915();
				@Pc(83) Class1 local83;
				if (arg1 == 5) {
					local83 = new Class1_Sub6(arg0.method935());
				} else {
					local83 = new Class1_Sub16(arg0.method915());
				}
				this.aClass33_8.method1072((long) local73, local83);
			}
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(ZLclient!nc;)V")
	public void method2124(@OriginalArg(1) Class1_Sub9 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method895();
			if (local14 == 0) {
				return;
			}
			this.method2123(arg0, local14);
		}
	}
}
