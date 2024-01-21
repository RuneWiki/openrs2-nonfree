import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public final class Class5 {

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "Lclient!lb;")
	private final Class1_Sub1 aClass1_Sub1_9 = new Class1_Sub1();

	@OriginalMember(owner = "client!ba", name = "B", descriptor = "Lclient!md;")
	private final Class38 aClass38_1 = new Class38();

	@OriginalMember(owner = "client!ba", name = "x", descriptor = "I")
	private final int anInt191;

	@OriginalMember(owner = "client!ba", name = "w", descriptor = "I")
	private int anInt190;

	@OriginalMember(owner = "client!ba", name = "s", descriptor = "Lclient!de;")
	private final Class14 aClass14_3;

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(I)V")
	public Class5(@OriginalArg(0) int arg0) {
		this.anInt191 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; local16 + local16 < arg0; local16 += local16) {
		}
		this.anInt190 = arg0;
		this.aClass14_3 = new Class14(local16);
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(BJ)V")
	public void method96(@OriginalArg(1) long arg0) {
		@Pc(6) Class1_Sub1 local6 = (Class1_Sub1) this.aClass14_3.method343(arg0);
		if (local6 != null) {
			local6.method1913();
			local6.method1855();
			this.anInt190++;
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!lb;JZ)V")
	public void method97(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(1) long arg1) {
		if (this.anInt190 == 0) {
			@Pc(21) Class1_Sub1 local21 = this.aClass38_1.method1204();
			local21.method1913();
			local21.method1855();
			if (this.aClass1_Sub1_9 == local21) {
				local21 = this.aClass38_1.method1204();
				local21.method1913();
				local21.method1855();
			}
		} else {
			this.anInt190--;
		}
		this.aClass14_3.method345(arg0, arg1);
		this.aClass38_1.method1207(arg0);
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IJ)Lclient!lb;")
	public Class1_Sub1 method98(@OriginalArg(1) long arg0) {
		@Pc(14) Class1_Sub1 local14 = (Class1_Sub1) this.aClass14_3.method343(arg0);
		if (local14 != null) {
			this.aClass38_1.method1207(local14);
		}
		return local14;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V")
	public void method99() {
		while (true) {
			@Pc(8) Class1_Sub1 local8 = this.aClass38_1.method1204();
			if (local8 == null) {
				this.anInt190 = this.anInt191;
				return;
			}
			local8.method1913();
			local8.method1855();
		}
	}
}
