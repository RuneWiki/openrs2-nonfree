import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public final class Class3_Sub7_Sub6 extends Class3_Sub7 {

	@OriginalMember(owner = "client!go", name = "B", descriptor = "Lclient!bo;")
	private Class24 aClass24_11;

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;")
	public String method1831(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass24_11 == null) {
			return arg1;
		} else {
			@Pc(16) Class3_Sub24 local16 = (Class3_Sub24) this.aClass24_11.method609((long) arg0);
			return local16 == null ? arg1 : local16.aString96;
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(ILclient!fb;)V")
	public void method1832(@OriginalArg(1) Class3_Sub4 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method3643();
			if (local14 == 0) {
				return;
			}
			this.method1837(arg0, local14);
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(III)I")
	public int method1834(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass24_11 == null) {
			return arg0;
		} else {
			@Pc(22) Class3_Sub22 local22 = (Class3_Sub22) this.aClass24_11.method609((long) arg1);
			return local22 == null ? arg0 : local22.anInt2181;
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Lclient!fb;II)V")
	private void method1837(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(12) int local12 = arg0.method3643();
		@Pc(19) int local19;
		if (this.aClass24_11 == null) {
			local19 = Static83.method1300(local12);
			this.aClass24_11 = new Class24(local19);
		}
		for (local19 = 0; local19 < local12; local19++) {
			@Pc(40) boolean local40 = arg0.method3643() == 1;
			@Pc(44) int local44 = arg0.method3659();
			@Pc(53) Class3 local53;
			if (local40) {
				local53 = new Class3_Sub24(arg0.method3671());
			} else {
				local53 = new Class3_Sub22(arg0.method3642());
			}
			this.aClass24_11.method598((long) local44, local53);
		}
	}
}
