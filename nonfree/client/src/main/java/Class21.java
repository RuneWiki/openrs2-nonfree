import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class21 {

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "Lclient!ed;")
	private final Class2_Sub1 aClass2_Sub1_25 = new Class2_Sub1();

	@OriginalMember(owner = "client!ge", name = "h", descriptor = "Lclient!ie;")
	private final Class28 aClass28_3 = new Class28();

	@OriginalMember(owner = "client!ge", name = "n", descriptor = "I")
	private final int anInt1216;

	@OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
	private int anInt1212;

	@OriginalMember(owner = "client!ge", name = "o", descriptor = "Lclient!bc;")
	private final Class7 aClass7_2;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(I)V")
	public Class21(@OriginalArg(0) int arg0) {
		this.anInt1216 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; arg0 > local16 + local16; local16 += local16) {
		}
		this.anInt1212 = arg0;
		this.aClass7_2 = new Class7(local16);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
	public void method743() {
		while (true) {
			@Pc(18) Class2_Sub1 local18 = this.aClass28_3.method829();
			if (local18 == null) {
				this.anInt1212 = this.anInt1216;
				return;
			}
			local18.method1794();
			local18.method1803();
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(JI)Lclient!ed;")
	public Class2_Sub1 method744(@OriginalArg(0) long arg0) {
		@Pc(16) Class2_Sub1 local16 = (Class2_Sub1) this.aClass7_2.method165(arg0);
		if (local16 != null) {
			this.aClass28_3.method819(local16);
		}
		return local16;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(JLclient!ed;B)V")
	public void method745(@OriginalArg(0) long arg0, @OriginalArg(1) Class2_Sub1 arg1) {
		if (this.anInt1212 == 0) {
			@Pc(10) Class2_Sub1 local10 = this.aClass28_3.method829();
			local10.method1794();
			local10.method1803();
			if (this.aClass2_Sub1_25 == local10) {
				local10 = this.aClass28_3.method829();
				local10.method1794();
				local10.method1803();
			}
		} else {
			this.anInt1212--;
		}
		this.aClass7_2.method167(arg0, arg1);
		this.aClass28_3.method819(arg1);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(JZ)V")
	public void method747(@OriginalArg(0) long arg0) {
		@Pc(13) Class2_Sub1 local13 = (Class2_Sub1) this.aClass7_2.method165(arg0);
		if (local13 != null) {
			local13.method1794();
			local13.method1803();
			this.anInt1212++;
		}
	}
}
