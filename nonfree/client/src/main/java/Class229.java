import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nv")
public final class Class229 {

	@OriginalMember(owner = "client!nv", name = "w", descriptor = "I")
	public int anInt6357;

	@OriginalMember(owner = "client!nv", name = "l", descriptor = "Lclient!ad;")
	private final Class6 aClass6_45 = new Class6(64);

	@OriginalMember(owner = "client!nv", name = "t", descriptor = "Lclient!ad;")
	public final Class6 aClass6_46 = new Class6(50);

	@OriginalMember(owner = "client!nv", name = "v", descriptor = "Lclient!ad;")
	public final Class6 aClass6_47 = new Class6(5);

	@OriginalMember(owner = "client!nv", name = "r", descriptor = "Lclient!tf;")
	private final Class322 aClass322_111;

	@OriginalMember(owner = "client!nv", name = "s", descriptor = "Z")
	public boolean aBoolean461;

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "Lclient!tf;")
	public final Class322 aClass322_110;

	@OriginalMember(owner = "client!nv", name = "f", descriptor = "Lclient!qh;")
	public final Class274 aClass274_3;

	@OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(Lclient!qh;IZLclient!tf;Lclient!tf;)V")
	public Class229(@OriginalArg(0) Class274 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class322 arg3, @OriginalArg(4) Class322 arg4) {
		this.aClass322_111 = arg3;
		this.aBoolean461 = arg2;
		this.aClass322_110 = arg4;
		this.aClass274_3 = arg0;
		if (this.aClass322_111 != null) {
			@Pc(41) int local41 = this.aClass322_111.method6825() - 1;
			this.aClass322_111.method6831(local41);
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IZ)V")
	public void method5389(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean461) {
			this.aBoolean461 = arg0;
			this.method5392();
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(II)V")
	public void method5390() {
		@Pc(6) Class6 local6 = this.aClass6_45;
		synchronized (this.aClass6_45) {
			this.aClass6_45.method97(5);
		}
		local6 = this.aClass6_46;
		synchronized (this.aClass6_46) {
			this.aClass6_46.method97(5);
		}
		local6 = this.aClass6_47;
		synchronized (this.aClass6_47) {
			this.aClass6_47.method97(5);
		}
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(I)V")
	public void method5391() {
		@Pc(2) Class6 local2 = this.aClass6_46;
		synchronized (this.aClass6_46) {
			this.aClass6_46.method102();
		}
		local2 = this.aClass6_47;
		synchronized (this.aClass6_47) {
			this.aClass6_47.method102();
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(Z)V")
	public void method5392() {
		@Pc(6) Class6 local6 = this.aClass6_45;
		synchronized (this.aClass6_45) {
			this.aClass6_45.method102();
		}
		local6 = this.aClass6_46;
		synchronized (this.aClass6_46) {
			this.aClass6_46.method102();
		}
		local6 = this.aClass6_47;
		synchronized (this.aClass6_47) {
			this.aClass6_47.method102();
		}
	}

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "(II)V")
	public void method5393(@OriginalArg(1) int arg0) {
		this.anInt6357 = arg0;
		@Pc(9) Class6 local9 = this.aClass6_46;
		synchronized (this.aClass6_46) {
			this.aClass6_46.method102();
		}
		local9 = this.aClass6_47;
		synchronized (this.aClass6_47) {
			this.aClass6_47.method102();
		}
	}

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "(II)Lclient!pw;")
	public Class264 method5396(@OriginalArg(1) int arg0) {
		@Pc(6) Class6 local6 = this.aClass6_45;
		@Pc(16) Class264 local16;
		synchronized (this.aClass6_45) {
			local16 = (Class264) this.aClass6_45.method92((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class322 local29 = this.aClass322_111;
		@Pc(42) byte[] local42;
		synchronized (this.aClass322_111) {
			local42 = this.aClass322_111.method6802(Static109.method1913(arg0), Static250.method3870(arg0));
		}
		local16 = new Class264();
		local16.anInt7148 = arg0;
		local16.aClass229_10 = this;
		if (local42 != null) {
			local16.method6000(new Class3_Sub11(local42));
		}
		local16.method5998();
		@Pc(78) Class6 local78 = this.aClass6_45;
		synchronized (this.aClass6_45) {
			this.aClass6_45.method106((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "(I)V")
	public void method5398() {
		@Pc(6) Class6 local6 = this.aClass6_45;
		synchronized (this.aClass6_45) {
			this.aClass6_45.method94();
		}
		local6 = this.aClass6_46;
		synchronized (this.aClass6_46) {
			this.aClass6_46.method94();
		}
		local6 = this.aClass6_47;
		synchronized (this.aClass6_47) {
			this.aClass6_47.method94();
		}
	}
}
