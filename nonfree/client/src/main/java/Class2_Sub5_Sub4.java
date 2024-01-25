import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fq")
public final class Class2_Sub5_Sub4 extends Class2_Sub5 {

	@OriginalMember(owner = "client!fq", name = "q", descriptor = "Lclient!ew;")
	private Class72 aClass72_13;

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(IZLjava/lang/String;)Ljava/lang/String;")
	public String method1811(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass72_13 == null) {
			return arg1;
		} else {
			@Pc(23) Class2_Sub3 local23 = (Class2_Sub3) this.aClass72_13.method1659((long) arg0);
			return local23 == null ? arg1 : local23.aString10;
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(IILclient!sv;)V")
	private void method1812(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		if (arg0 != 249) {
			return;
		}
		@Pc(20) int local20 = arg1.method3580();
		@Pc(27) int local27;
		if (this.aClass72_13 == null) {
			local27 = Static29.method453(local20);
			this.aClass72_13 = new Class72(local27);
		}
		for (local27 = 0; local27 < local20; local27++) {
			@Pc(48) boolean local48 = arg1.method3580() == 1;
			@Pc(52) int local52 = arg1.method3563();
			@Pc(61) Class2 local61;
			if (local48) {
				local61 = new Class2_Sub3(arg1.method3582());
			} else {
				local61 = new Class2_Sub20(arg1.method3574());
			}
			this.aClass72_13.method1653(local61, (long) local52);
		}
	}

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "(ILclient!sv;)V")
	public void method1814(@OriginalArg(1) Class2_Sub13 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method3580();
			if (local17 == 0) {
				return;
			}
			this.method1812(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(III)I")
	public int method1816(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass72_13 == null) {
			return arg1;
		} else {
			@Pc(24) Class2_Sub20 local24 = (Class2_Sub20) this.aClass72_13.method1659((long) arg0);
			return local24 == null ? arg1 : local24.anInt2212;
		}
	}
}
