import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class263 {

	@OriginalMember(owner = "client!wc", name = "v", descriptor = "I")
	public int anInt7098;

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "Lclient!ka;")
	private final Class132 aClass132_58 = new Class132(64);

	@OriginalMember(owner = "client!wc", name = "t", descriptor = "Lclient!ka;")
	public final Class132 aClass132_59 = new Class132(50);

	@OriginalMember(owner = "client!wc", name = "u", descriptor = "Lclient!ka;")
	public final Class132 aClass132_60 = new Class132(5);

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "Z")
	public boolean aBoolean515;

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "Lclient!dk;")
	public final Class54 aClass54_113;

	@OriginalMember(owner = "client!wc", name = "i", descriptor = "Lclient!dk;")
	private final Class54 aClass54_114;

	@OriginalMember(owner = "client!wc", name = "s", descriptor = "Lclient!ad;")
	public final Class4 aClass4_4;

	static {
		new Class134("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lclient!ad;IZLclient!dk;Lclient!dk;)V")
	public Class263(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class54 arg3, @OriginalArg(4) Class54 arg4) {
		this.aBoolean515 = arg2;
		this.aClass54_113 = arg4;
		this.aClass54_114 = arg3;
		this.aClass4_4 = arg0;
		if (this.aClass54_114 != null) {
			@Pc(41) int local41 = this.aClass54_114.method1107() - 1;
			this.aClass54_114.method1123(local41);
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(BI)Lclient!um;")
	public Class245 method5581(@OriginalArg(1) int arg0) {
		@Pc(6) Class132 local6 = this.aClass132_58;
		@Pc(16) Class245 local16;
		synchronized (this.aClass132_58) {
			local16 = (Class245) this.aClass132_58.method2701((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class54 local37 = this.aClass54_114;
		@Pc(50) byte[] local50;
		synchronized (this.aClass54_114) {
			local50 = this.aClass54_114.method1126(Static106.method1645(arg0), Static314.method4290(arg0));
		}
		local16 = new Class245();
		local16.aClass263_2 = this;
		local16.anInt6723 = arg0;
		if (local50 != null) {
			local16.method5195(new Class2_Sub13(local50));
		}
		local16.method5206();
		@Pc(81) Class132 local81 = this.aClass132_58;
		synchronized (this.aClass132_58) {
			this.aClass132_58.method2711(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)V")
	public void method5582() {
		@Pc(6) Class132 local6 = this.aClass132_58;
		synchronized (this.aClass132_58) {
			this.aClass132_58.method2708();
		}
		local6 = this.aClass132_59;
		synchronized (this.aClass132_59) {
			this.aClass132_59.method2708();
		}
		local6 = this.aClass132_60;
		synchronized (this.aClass132_60) {
			this.aClass132_60.method2708();
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V")
	public void method5583() {
		@Pc(2) Class132 local2 = this.aClass132_58;
		synchronized (this.aClass132_58) {
			this.aClass132_58.method2698();
		}
		local2 = this.aClass132_59;
		synchronized (this.aClass132_59) {
			this.aClass132_59.method2698();
		}
		local2 = this.aClass132_60;
		synchronized (this.aClass132_60) {
			this.aClass132_60.method2698();
		}
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)V")
	public void method5584() {
		@Pc(2) Class132 local2 = this.aClass132_59;
		synchronized (this.aClass132_59) {
			this.aClass132_59.method2698();
		}
		local2 = this.aClass132_60;
		synchronized (this.aClass132_60) {
			this.aClass132_60.method2698();
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IZ)V")
	public void method5585(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean515) {
			this.aBoolean515 = arg0;
			this.method5583();
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IB)V")
	public void method5588(@OriginalArg(0) int arg0) {
		this.anInt7098 = arg0;
		@Pc(9) Class132 local9 = this.aClass132_59;
		synchronized (this.aClass132_59) {
			this.aClass132_59.method2698();
		}
		local9 = this.aClass132_60;
		synchronized (this.aClass132_60) {
			this.aClass132_60.method2698();
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)V")
	public void method5589() {
		@Pc(6) Class132 local6 = this.aClass132_58;
		synchronized (this.aClass132_58) {
			this.aClass132_58.method2713(5);
		}
		local6 = this.aClass132_59;
		synchronized (this.aClass132_59) {
			this.aClass132_59.method2713(5);
		}
		local6 = this.aClass132_60;
		synchronized (this.aClass132_60) {
			this.aClass132_60.method2713(5);
		}
	}
}
