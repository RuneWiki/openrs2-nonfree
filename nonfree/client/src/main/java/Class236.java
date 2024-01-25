import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vk")
public final class Class236 {

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "Lclient!mo;")
	private final Class160 aClass160_60 = new Class160(64);

	@OriginalMember(owner = "client!vk", name = "i", descriptor = "Lclient!mo;")
	private final Class160 aClass160_61 = new Class160(100);

	@OriginalMember(owner = "client!vk", name = "h", descriptor = "Lclient!nl;")
	private final Class171 aClass171_96;

	static {
		new Class32("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
	}

	@OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Lclient!lo;ILclient!nl;Lclient!nl;Lclient!nl;)V")
	public Class236(@OriginalArg(0) Class150 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class171 arg2, @OriginalArg(3) Class171 arg3, @OriginalArg(4) Class171 arg4) {
		this.aClass171_96 = arg2;
		if (this.aClass171_96 != null) {
			@Pc(26) int local26 = this.aClass171_96.method3770() - 1;
			this.aClass171_96.method3750(local26);
		}
		Static2.method30(arg4, arg3);
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)Lclient!nc;")
	public Class2_Sub10_Sub12 method5395(@OriginalArg(1) int arg0) {
		@Pc(14) Class160 local14 = this.aClass160_61;
		@Pc(24) Class2_Sub10_Sub12 local24;
		synchronized (this.aClass160_61) {
			local24 = (Class2_Sub10_Sub12) this.aClass160_61.method3599((long) arg0);
			if (local24 == null) {
				local24 = new Class2_Sub10_Sub12(arg0);
				this.aClass160_61.method3602((long) arg0, local24);
			}
		}
		synchronized (local24) {
			return local24.method3686() ? local24 : null;
		}
	}

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "(II)Lclient!qp;")
	public Class202 method5396(@OriginalArg(1) int arg0) {
		@Pc(11) Class160 local11 = this.aClass160_60;
		@Pc(21) Class202 local21;
		synchronized (this.aClass160_60) {
			local21 = (Class202) this.aClass160_60.method3599((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(42) byte[] local42 = this.aClass171_96.method3745(Static363.method5389(arg0), Static214.method3577(arg0));
		local21 = new Class202();
		local21.anInt4931 = arg0;
		local21.aClass236_2 = this;
		if (local42 != null) {
			local21.method4332(new Class2_Sub16(local42));
		}
		local21.method4326();
		@Pc(67) Class160 local67 = this.aClass160_60;
		synchronized (this.aClass160_60) {
			this.aClass160_60.method3602((long) arg0, local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(Z)V")
	public void method5397() {
		@Pc(6) Class160 local6 = this.aClass160_60;
		synchronized (this.aClass160_60) {
			this.aClass160_60.method3595();
		}
		local6 = this.aClass160_61;
		synchronized (this.aClass160_61) {
			this.aClass160_61.method3595();
		}
	}

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "(Z)V")
	public void method5399() {
		@Pc(8) Class160 local8 = this.aClass160_60;
		synchronized (this.aClass160_60) {
			this.aClass160_60.method3605();
		}
		local8 = this.aClass160_61;
		synchronized (this.aClass160_61) {
			this.aClass160_61.method3605();
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IB)V")
	public void method5400() {
		@Pc(2) Class160 local2 = this.aClass160_60;
		synchronized (this.aClass160_60) {
			this.aClass160_60.method3606(5);
		}
		local2 = this.aClass160_61;
		synchronized (this.aClass160_61) {
			this.aClass160_61.method3606(5);
		}
	}
}
