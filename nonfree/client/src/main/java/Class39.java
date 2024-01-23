import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class39 {

	@OriginalMember(owner = "client!ge", name = "r", descriptor = "Lclient!qg;")
	private Class1_Sub1 aClass1_Sub1_17 = new Class1_Sub1();

	@OriginalMember(owner = "client!ge", name = "t", descriptor = "Lclient!jh;")
	private Class52 aClass52_2 = new Class52();

	@OriginalMember(owner = "client!ge", name = "w", descriptor = "I")
	private int anInt1600;

	@OriginalMember(owner = "client!ge", name = "u", descriptor = "I")
	private int anInt1599;

	@OriginalMember(owner = "client!ge", name = "s", descriptor = "Lclient!ff;")
	private Class33 aClass33_4;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(I)V")
	public Class39(@OriginalArg(0) int arg0) {
		this.anInt1600 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; local16 + local16 < arg0; local16 += local16) {
		}
		this.anInt1599 = arg0;
		this.aClass33_4 = new Class33(local16);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(JLclient!qg;I)V")
	public void method1152(@OriginalArg(0) long arg0, @OriginalArg(1) Class1_Sub1 arg1) {
		if (this.anInt1599 == 0) {
			@Pc(16) Class1_Sub1 local16 = this.aClass52_2.method1678();
			local16.method3530();
			local16.method3434();
			if (local16 == this.aClass1_Sub1_17) {
				local16 = this.aClass52_2.method1678();
				local16.method3530();
				local16.method3434();
			}
		} else {
			this.anInt1599--;
		}
		this.aClass33_4.method1072(arg0, arg1);
		this.aClass52_2.method1671(arg1);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)Lclient!b;")
	public Class1 method1153() {
		return this.aClass33_4.method1070();
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)Lclient!b;")
	public Class1 method1155() {
		return this.aClass33_4.method1067();
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V")
	public void method1158() {
		while (true) {
			@Pc(6) Class1_Sub1 local6 = this.aClass52_2.method1678();
			if (local6 == null) {
				this.anInt1599 = this.anInt1600;
				return;
			}
			local6.method3530();
			local6.method3434();
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IJ)Lclient!qg;")
	public Class1_Sub1 method1161(@OriginalArg(1) long arg0) {
		@Pc(10) Class1_Sub1 local10 = (Class1_Sub1) this.aClass33_4.method1071(arg0);
		if (local10 != null) {
			this.aClass52_2.method1671(local10);
		}
		return local10;
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(IJ)V")
	public void method1162(@OriginalArg(1) long arg0) {
		@Pc(16) Class1_Sub1 local16 = (Class1_Sub1) this.aClass33_4.method1071(arg0);
		if (local16 != null) {
			local16.method3530();
			local16.method3434();
			this.anInt1599++;
		}
	}
}
