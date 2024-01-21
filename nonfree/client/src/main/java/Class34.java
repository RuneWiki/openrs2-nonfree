import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class34 {

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "Lclient!wb;")
	private final Class3_Sub1 aClass3_Sub1_27 = new Class3_Sub1();

	@OriginalMember(owner = "client!jb", name = "p", descriptor = "Lclient!ld;")
	private final Class40 aClass40_2 = new Class40();

	@OriginalMember(owner = "client!jb", name = "s", descriptor = "I")
	private final int anInt1368;

	@OriginalMember(owner = "client!jb", name = "w", descriptor = "I")
	private int anInt1369;

	@OriginalMember(owner = "client!jb", name = "q", descriptor = "Lclient!mc;")
	private final Class43 aClass43_5;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(I)V")
	public Class34(@OriginalArg(0) int arg0) {
		this.anInt1368 = arg0;
		@Pc(16) int local16 = 1;
		this.anInt1369 = arg0;
		while (local16 + local16 < arg0) {
			local16 += local16;
		}
		this.aClass43_5 = new Class43(local16);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(BJ)V")
	public void method759(@OriginalArg(1) long arg0) {
		@Pc(17) Class3_Sub1 local17 = (Class3_Sub1) this.aClass43_5.method1079(arg0);
		if (local17 != null) {
			local17.method1852();
			local17.method1839();
			this.anInt1369++;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
	public void method762() {
		while (true) {
			@Pc(15) Class3_Sub1 local15 = this.aClass40_2.method978();
			if (local15 == null) {
				this.anInt1369 = this.anInt1368;
				return;
			}
			local15.method1852();
			local15.method1839();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IJ)Lclient!wb;")
	public Class3_Sub1 method764(@OriginalArg(1) long arg0) {
		@Pc(16) Class3_Sub1 local16 = (Class3_Sub1) this.aClass43_5.method1079(arg0);
		if (local16 != null) {
			this.aClass40_2.method982(local16);
		}
		return local16;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(JLclient!wb;B)V")
	public void method765(@OriginalArg(0) long arg0, @OriginalArg(1) Class3_Sub1 arg1) {
		if (this.anInt1369 == 0) {
			@Pc(19) Class3_Sub1 local19 = this.aClass40_2.method978();
			local19.method1852();
			local19.method1839();
			if (local19 == this.aClass3_Sub1_27) {
				local19 = this.aClass40_2.method978();
				local19.method1852();
				local19.method1839();
			}
		} else {
			this.anInt1369--;
		}
		this.aClass43_5.method1081(arg0, arg1);
		this.aClass40_2.method982(arg1);
	}
}
