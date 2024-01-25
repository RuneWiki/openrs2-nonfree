import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Class144 {

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "Lclient!ui;")
	private Class2_Sub9 aClass2_Sub9_46 = new Class2_Sub9();

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "Lclient!lq;")
	private final Class129 aClass129_9 = new Class129();

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
	private int anInt4915;

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
	private final int anInt4914;

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "Lclient!cm;")
	private final Class41 aClass41_28;

	static {
		new Class140("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
	}

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(I)V")
	public Class144(@OriginalArg(0) int arg0) {
		this.anInt4915 = arg0;
		this.anInt4914 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass41_28 = new Class41(local19);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V")
	public void method4184() {
		this.aClass129_9.method3580();
		this.aClass41_28.method907();
		this.aClass2_Sub9_46 = new Class2_Sub9();
		this.anInt4915 = this.anInt4914;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(JI)Lclient!ui;")
	public Class2_Sub9 method4186(@OriginalArg(0) long arg0) {
		@Pc(10) Class2_Sub9 local10 = (Class2_Sub9) this.aClass41_28.method902(arg0);
		if (local10 != null) {
			this.aClass129_9.method3575(local10);
		}
		return local10;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(JLclient!ui;Z)V")
	public void method4188(@OriginalArg(0) long arg0, @OriginalArg(1) Class2_Sub9 arg1) {
		if (this.anInt4915 == 0) {
			@Pc(11) Class2_Sub9 local11 = this.aClass129_9.method3582();
			local11.method5723();
			local11.method5600();
			if (local11 == this.aClass2_Sub9_46) {
				local11 = this.aClass129_9.method3582();
				local11.method5723();
				local11.method5600();
			}
		} else {
			this.anInt4915--;
		}
		this.aClass41_28.method901(arg1, arg0);
		this.aClass129_9.method3575(arg1);
	}
}
