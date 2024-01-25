import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class49 {

	@OriginalMember(owner = "client!ce", name = "n", descriptor = "Lclient!bm;")
	private Class3_Sub7 aClass3_Sub7_12;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "Lclient!bm;")
	private final Class3_Sub7 aClass3_Sub7_11 = new Class3_Sub7();

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "()V")
	public Class49() {
		this.aClass3_Sub7_11.aClass3_Sub7_61 = this.aClass3_Sub7_11;
		this.aClass3_Sub7_11.aClass3_Sub7_62 = this.aClass3_Sub7_11;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)Lclient!bm;")
	public Class3_Sub7 method1446() {
		@Pc(7) Class3_Sub7 local7 = this.aClass3_Sub7_11.aClass3_Sub7_62;
		if (this.aClass3_Sub7_11 == local7) {
			return null;
		} else {
			local7.method8136();
			return local7;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)Lclient!bm;")
	public Class3_Sub7 method1448() {
		@Pc(12) Class3_Sub7 local12 = this.aClass3_Sub7_11.aClass3_Sub7_61;
		if (this.aClass3_Sub7_11 == local12) {
			this.aClass3_Sub7_12 = null;
			return null;
		} else {
			this.aClass3_Sub7_12 = local12.aClass3_Sub7_61;
			return local12;
		}
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)I")
	public int method1449() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class3_Sub7 local11 = this.aClass3_Sub7_11.aClass3_Sub7_61;
		while (local11 != this.aClass3_Sub7_11) {
			local11 = local11.aClass3_Sub7_61;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)V")
	public void method1450() {
		while (true) {
			@Pc(17) Class3_Sub7 local17 = this.aClass3_Sub7_11.aClass3_Sub7_61;
			if (this.aClass3_Sub7_11 == local17) {
				this.aClass3_Sub7_12 = null;
				return;
			}
			local17.method8136();
		}
	}

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "(I)Lclient!bm;")
	public Class3_Sub7 method1451() {
		@Pc(11) Class3_Sub7 local11 = this.aClass3_Sub7_12;
		if (local11 == this.aClass3_Sub7_11) {
			this.aClass3_Sub7_12 = null;
			return null;
		} else {
			this.aClass3_Sub7_12 = local11.aClass3_Sub7_61;
			return local11;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)Lclient!bm;")
	public Class3_Sub7 method1452() {
		@Pc(7) Class3_Sub7 local7 = this.aClass3_Sub7_11.aClass3_Sub7_61;
		if (this.aClass3_Sub7_11 == local7) {
			return null;
		} else {
			local7.method8136();
			return local7;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILclient!bm;)V")
	public void method1453(@OriginalArg(1) Class3_Sub7 arg0) {
		if (arg0.aClass3_Sub7_62 != null) {
			arg0.method8136();
		}
		arg0.aClass3_Sub7_62 = this.aClass3_Sub7_11;
		arg0.aClass3_Sub7_61 = this.aClass3_Sub7_11.aClass3_Sub7_61;
		arg0.aClass3_Sub7_62.aClass3_Sub7_61 = arg0;
		arg0.aClass3_Sub7_61.aClass3_Sub7_62 = arg0;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!bm;I)V")
	public void method1455(@OriginalArg(0) Class3_Sub7 arg0) {
		if (arg0.aClass3_Sub7_62 != null) {
			arg0.method8136();
		}
		arg0.aClass3_Sub7_61 = this.aClass3_Sub7_11;
		arg0.aClass3_Sub7_62 = this.aClass3_Sub7_11.aClass3_Sub7_62;
		arg0.aClass3_Sub7_62.aClass3_Sub7_61 = arg0;
		arg0.aClass3_Sub7_61.aClass3_Sub7_62 = arg0;
	}
}
