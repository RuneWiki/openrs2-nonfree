import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public final class Class85 {

	@OriginalMember(owner = "client!ri", name = "g", descriptor = "Lclient!ni;")
	private final Class3_Sub3 aClass3_Sub3_50 = new Class3_Sub3();

	@OriginalMember(owner = "client!ri", name = "q", descriptor = "Lclient!di;")
	private final Class23 aClass23_2 = new Class23();

	@OriginalMember(owner = "client!ri", name = "r", descriptor = "I")
	private int anInt3436;

	@OriginalMember(owner = "client!ri", name = "o", descriptor = "I")
	private final int anInt3434;

	@OriginalMember(owner = "client!ri", name = "s", descriptor = "Lclient!gj;")
	private final Class40 aClass40_13;

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(I)V")
	public Class85(@OriginalArg(0) int arg0) {
		this.anInt3436 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; arg0 > local16 + local16; local16 += local16) {
		}
		this.anInt3434 = arg0;
		this.aClass40_13 = new Class40(local16);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)Lclient!id;")
	public Class3 method2554() {
		return this.aClass40_13.method1024();
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)V")
	public void method2557() {
		while (true) {
			@Pc(8) Class3_Sub3 local8 = this.aClass23_2.method678();
			if (local8 == null) {
				this.anInt3436 = this.anInt3434;
				return;
			}
			local8.method3320();
			local8.method3214();
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IJ)Lclient!ni;")
	public Class3_Sub3 method2558(@OriginalArg(1) long arg0) {
		@Pc(16) Class3_Sub3 local16 = (Class3_Sub3) this.aClass40_13.method1029(arg0);
		if (local16 != null) {
			this.aClass23_2.method674(local16);
		}
		return local16;
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(B)Lclient!id;")
	public Class3 method2559() {
		return this.aClass40_13.method1026();
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lclient!ni;IJ)V")
	public void method2560(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(2) long arg1) {
		if (this.anInt3436 == 0) {
			@Pc(17) Class3_Sub3 local17 = this.aClass23_2.method678();
			local17.method3320();
			local17.method3214();
			if (this.aClass3_Sub3_50 == local17) {
				local17 = this.aClass23_2.method678();
				local17.method3320();
				local17.method3214();
			}
		} else {
			this.anInt3436--;
		}
		this.aClass40_13.method1027(arg0, arg1);
		this.aClass23_2.method674(arg0);
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(IJ)V")
	public void method2561(@OriginalArg(1) long arg0) {
		@Pc(16) Class3_Sub3 local16 = (Class3_Sub3) this.aClass40_13.method1029(arg0);
		if (local16 != null) {
			local16.method3320();
			local16.method3214();
			this.anInt3436++;
		}
	}
}
