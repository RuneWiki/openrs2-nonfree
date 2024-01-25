import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kja")
public final class Class204 {

	@OriginalMember(owner = "client!kja", name = "l", descriptor = "Lclient!rl;")
	private final Class317 aClass317_28 = new Class317(64);

	@OriginalMember(owner = "client!kja", name = "e", descriptor = "Lclient!rl;")
	private final Class317 aClass317_29 = new Class317(100);

	@OriginalMember(owner = "client!kja", name = "b", descriptor = "Lclient!rg;")
	private final Class310 aClass310_61;

	@OriginalMember(owner = "client!kja", name = "<init>", descriptor = "(Lclient!dja;ILclient!rg;Lclient!rg;Lclient!rg;)V")
	public Class204(@OriginalArg(0) Class80 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class310 arg2, @OriginalArg(3) Class310 arg3, @OriginalArg(4) Class310 arg4) {
		this.aClass310_61 = arg2;
		if (this.aClass310_61 != null) {
			@Pc(26) int local26 = this.aClass310_61.method7800() - 1;
			this.aClass310_61.method7773(local26);
		}
		Static14.method264(arg3, arg4);
	}

	@OriginalMember(owner = "client!kja", name = "a", descriptor = "(I)V")
	public void method5040() {
		@Pc(6) Class317 local6 = this.aClass317_28;
		synchronized (this.aClass317_28) {
			this.aClass317_28.method7873();
		}
		local6 = this.aClass317_29;
		synchronized (this.aClass317_29) {
			this.aClass317_29.method7873();
		}
	}

	@OriginalMember(owner = "client!kja", name = "a", descriptor = "(II)Lclient!nw;")
	public Class259 method5041(@OriginalArg(1) int arg0) {
		@Pc(6) Class317 local6 = this.aClass317_28;
		@Pc(16) Class259 local16;
		synchronized (this.aClass317_28) {
			local16 = (Class259) this.aClass317_28.method7882((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class310 local30 = this.aClass310_61;
		@Pc(43) byte[] local43;
		synchronized (this.aClass310_61) {
			local43 = this.aClass310_61.method7803(Static566.method8133(arg0), Static519.method8433(arg0));
		}
		local16 = new Class259();
		local16.anInt7197 = arg0;
		if (local43 != null) {
			local16.method6296(new Class14_Sub21(local43));
		}
		local16.method6298();
		@Pc(85) Class317 local85 = this.aClass317_28;
		synchronized (this.aClass317_28) {
			this.aClass317_28.method7875((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!kja", name = "c", descriptor = "(II)Lclient!rh;")
	public Class14_Sub2_Sub15 method5043(@OriginalArg(1) int arg0) {
		@Pc(6) Class317 local6 = this.aClass317_29;
		synchronized (this.aClass317_29) {
			@Pc(16) Class14_Sub2_Sub15 local16 = (Class14_Sub2_Sub15) this.aClass317_29.method7882((long) arg0);
			if (local16 == null) {
				local16 = new Class14_Sub2_Sub15(arg0);
				this.aClass317_29.method7875((long) arg0, local16);
			}
			return local16.method7831() ? local16 : null;
		}
	}

	@OriginalMember(owner = "client!kja", name = "b", descriptor = "(II)V")
	public void method5044() {
		@Pc(2) Class317 local2 = this.aClass317_28;
		synchronized (this.aClass317_28) {
			this.aClass317_28.method7870(5);
		}
		local2 = this.aClass317_29;
		synchronized (this.aClass317_29) {
			this.aClass317_29.method7870(5);
		}
	}

	@OriginalMember(owner = "client!kja", name = "b", descriptor = "(I)V")
	public void method5046() {
		@Pc(2) Class317 local2 = this.aClass317_28;
		synchronized (this.aClass317_28) {
			this.aClass317_28.method7874();
		}
		local2 = this.aClass317_29;
		synchronized (this.aClass317_29) {
			this.aClass317_29.method7874();
		}
	}
}
