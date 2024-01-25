import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class249 {

	@OriginalMember(owner = "client!ng", name = "i", descriptor = "I")
	public int anInt7027;

	@OriginalMember(owner = "client!ng", name = "t", descriptor = "Z")
	public boolean aBoolean497 = false;

	@OriginalMember(owner = "client!ng", name = "z", descriptor = "Lclient!rl;")
	private Class317 aClass317_38 = new Class317(64);

	@OriginalMember(owner = "client!ng", name = "o", descriptor = "Lclient!rl;")
	public final Class317 aClass317_39 = new Class317(500);

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "Lclient!rl;")
	public final Class317 aClass317_40 = new Class317(30);

	@OriginalMember(owner = "client!ng", name = "p", descriptor = "Lclient!rl;")
	public final Class317 aClass317_41 = new Class317(50);

	@OriginalMember(owner = "client!ng", name = "l", descriptor = "Lclient!rg;")
	public final Class310 aClass310_87;

	@OriginalMember(owner = "client!ng", name = "k", descriptor = "I")
	private final int anInt7017;

	@OriginalMember(owner = "client!ng", name = "y", descriptor = "Lclient!rg;")
	private final Class310 aClass310_86;

	@OriginalMember(owner = "client!ng", name = "v", descriptor = "Z")
	public boolean aBoolean496;

	@OriginalMember(owner = "client!ng", name = "x", descriptor = "Lclient!dja;")
	private final Class80 aClass80_8;

	@OriginalMember(owner = "client!ng", name = "n", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray29;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lclient!dja;IZLclient!rg;Lclient!rg;)V")
	public Class249(@OriginalArg(0) Class80 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class310 arg3, @OriginalArg(4) Class310 arg4) {
		this.aClass310_87 = arg4;
		this.anInt7017 = arg1;
		this.aClass310_86 = arg3;
		this.aBoolean496 = arg2;
		this.aClass80_8 = arg0;
		if (this.aClass310_86 != null) {
			@Pc(53) int local53 = this.aClass310_86.method7800() - 1;
			this.aClass310_86.method7773(local53);
		}
		if (this.aClass80_8 == Static344.aClass80_7) {
			this.aStringArray29 = new String[] { null, null, null, null, null, Static21.aClass21_21.method324(this.anInt7017) };
		} else {
			this.aStringArray29 = new String[] { null, null, null, null, null, null };
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)V")
	public void method6117(@OriginalArg(0) int arg0) {
		this.anInt7027 = arg0;
		@Pc(9) Class317 local9 = this.aClass317_39;
		synchronized (this.aClass317_39) {
			this.aClass317_39.method7873();
		}
		local9 = this.aClass317_40;
		synchronized (this.aClass317_40) {
			this.aClass317_40.method7873();
		}
		local9 = this.aClass317_41;
		synchronized (this.aClass317_41) {
			this.aClass317_41.method7873();
		}
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)V")
	public void method6118() {
		@Pc(2) Class317 local2 = this.aClass317_38;
		synchronized (this.aClass317_38) {
			this.aClass317_38.method7873();
		}
		local2 = this.aClass317_39;
		synchronized (this.aClass317_39) {
			this.aClass317_39.method7873();
		}
		local2 = this.aClass317_40;
		synchronized (this.aClass317_40) {
			this.aClass317_40.method7873();
		}
		local2 = this.aClass317_41;
		synchronized (this.aClass317_41) {
			this.aClass317_41.method7873();
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IZ)Lclient!gba;")
	public Class128 method6119(@OriginalArg(0) int arg0) {
		@Pc(6) Class317 local6 = this.aClass317_38;
		@Pc(16) Class128 local16;
		synchronized (this.aClass317_38) {
			local16 = (Class128) this.aClass317_38.method7882((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class310 local30 = this.aClass310_86;
		@Pc(43) byte[] local43;
		synchronized (this.aClass310_86) {
			local43 = this.aClass310_86.method7803(Static11.method238(arg0), Static592.method8408(arg0));
		}
		local16 = new Class128();
		local16.aClass249_3 = this;
		local16.anInt2969 = arg0;
		local16.aStringArray18 = (String[]) this.aStringArray29.clone();
		if (local43 != null) {
			local16.method2673(new Class14_Sub21(local43));
		}
		local16.method2678();
		if (local16.aBoolean212) {
			local16.anInt2943 = 0;
			local16.aBoolean211 = false;
		}
		if (!this.aBoolean496 && local16.aBoolean213) {
			local16.anIntArray182 = null;
			local16.aStringArray18 = null;
		}
		@Pc(109) Class317 local109 = this.aClass317_38;
		synchronized (this.aClass317_38) {
			this.aClass317_38.method7875((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZI)V")
	public void method6121(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean496 != arg0) {
			this.aBoolean496 = arg0;
			this.method6118();
		}
	}

	@OriginalMember(owner = "client!ng", name = "d", descriptor = "(II)V")
	public void method6122(@OriginalArg(0) int arg0) {
		this.aClass317_38 = new Class317(arg0);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
	public void method6125() {
		@Pc(6) Class317 local6 = this.aClass317_38;
		synchronized (this.aClass317_38) {
			this.aClass317_38.method7874();
		}
		local6 = this.aClass317_39;
		synchronized (this.aClass317_39) {
			this.aClass317_39.method7874();
		}
		local6 = this.aClass317_40;
		synchronized (this.aClass317_40) {
			this.aClass317_40.method7874();
		}
		local6 = this.aClass317_41;
		synchronized (this.aClass317_41) {
			this.aClass317_41.method7874();
		}
	}

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "(II)V")
	public void method6128() {
		@Pc(2) Class317 local2 = this.aClass317_38;
		synchronized (this.aClass317_38) {
			this.aClass317_38.method7870(5);
		}
		local2 = this.aClass317_39;
		synchronized (this.aClass317_39) {
			this.aClass317_39.method7870(5);
		}
		local2 = this.aClass317_40;
		synchronized (this.aClass317_40) {
			this.aClass317_40.method7870(5);
		}
		local2 = this.aClass317_41;
		synchronized (this.aClass317_41) {
			this.aClass317_41.method7870(5);
		}
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(IZ)V")
	public void method6129(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean497) {
			this.aBoolean497 = arg0;
			this.method6118();
		}
	}
}
