import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ig")
public final class Class47 {

	@OriginalMember(owner = "client!ig", name = "k", descriptor = "Lclient!ue;")
	private final Class1_Sub3 aClass1_Sub3_23 = new Class1_Sub3();

	@OriginalMember(owner = "client!ig", name = "s", descriptor = "Lclient!td;")
	private final Class86 aClass86_1 = new Class86();

	@OriginalMember(owner = "client!ig", name = "r", descriptor = "I")
	private final int anInt1847;

	@OriginalMember(owner = "client!ig", name = "t", descriptor = "I")
	private int anInt1848;

	@OriginalMember(owner = "client!ig", name = "q", descriptor = "Lclient!wd;")
	private final Class97 aClass97_9;

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(I)V")
	public Class47(@OriginalArg(0) int arg0) {
		this.anInt1847 = arg0;
		@Pc(16) int local16 = 1;
		this.anInt1848 = arg0;
		while (arg0 > local16 + local16) {
			local16 += local16;
		}
		this.aClass97_9 = new Class97(local16);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)Lclient!md;")
	public Class1 method1272() {
		return this.aClass97_9.method3377();
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(JLclient!ue;B)V")
	public void method1273(@OriginalArg(0) long arg0, @OriginalArg(1) Class1_Sub3 arg1) {
		if (this.anInt1848 == 0) {
			@Pc(13) Class1_Sub3 local13 = this.aClass86_1.method2885();
			local13.method3414();
			local13.method3367();
			if (this.aClass1_Sub3_23 == local13) {
				local13 = this.aClass86_1.method2885();
				local13.method3414();
				local13.method3367();
			}
		} else {
			this.anInt1848--;
		}
		this.aClass97_9.method3374(arg1, arg0);
		this.aClass86_1.method2883(arg1);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Z)V")
	public void method1276() {
		while (true) {
			@Pc(6) Class1_Sub3 local6 = this.aClass86_1.method2885();
			if (local6 == null) {
				this.anInt1848 = this.anInt1847;
				return;
			}
			local6.method3414();
			local6.method3367();
		}
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)Lclient!md;")
	public Class1 method1277() {
		return this.aClass97_9.method3372();
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(JB)V")
	public void method1278(@OriginalArg(0) long arg0) {
		@Pc(15) Class1_Sub3 local15 = (Class1_Sub3) this.aClass97_9.method3375(arg0);
		if (local15 != null) {
			local15.method3414();
			local15.method3367();
			this.anInt1848++;
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(JI)Lclient!ue;")
	public Class1_Sub3 method1281(@OriginalArg(0) long arg0) {
		@Pc(15) Class1_Sub3 local15 = (Class1_Sub3) this.aClass97_9.method3375(arg0);
		if (local15 != null) {
			this.aClass86_1.method2883(local15);
		}
		return local15;
	}
}
