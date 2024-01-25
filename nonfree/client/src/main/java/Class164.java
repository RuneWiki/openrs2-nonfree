import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hq")
public final class Class164 {

	@OriginalMember(owner = "client!hq", name = "q", descriptor = "I")
	public int anInt4547;

	@OriginalMember(owner = "client!hq", name = "o", descriptor = "Lclient!ui;")
	private final Class359 aClass359_32 = new Class359(64);

	@OriginalMember(owner = "client!hq", name = "h", descriptor = "Lclient!ui;")
	public final Class359 aClass359_33 = new Class359(50);

	@OriginalMember(owner = "client!hq", name = "p", descriptor = "Lclient!ui;")
	public final Class359 aClass359_34 = new Class359(5);

	@OriginalMember(owner = "client!hq", name = "n", descriptor = "Lclient!lga;")
	public final Class223 aClass223_50;

	@OriginalMember(owner = "client!hq", name = "m", descriptor = "Lclient!fs;")
	public final Class121 aClass121_4;

	@OriginalMember(owner = "client!hq", name = "e", descriptor = "Lclient!lga;")
	private final Class223 aClass223_51;

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "I")
	private final int anInt4540;

	@OriginalMember(owner = "client!hq", name = "s", descriptor = "Z")
	public boolean aBoolean352;

	@OriginalMember(owner = "client!hq", name = "i", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray19;

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lclient!fs;IZLclient!lga;Lclient!lga;)V")
	public Class164(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class223 arg3, @OriginalArg(4) Class223 arg4) {
		this.aClass223_50 = arg4;
		this.aClass121_4 = arg0;
		this.aClass223_51 = arg3;
		this.anInt4540 = arg1;
		this.aBoolean352 = arg2;
		if (this.aClass223_51 != null) {
			@Pc(44) int local44 = this.aClass223_51.method5290() - 1;
			this.aClass223_51.method5264(local44);
		}
		if (Static517.aClass121_8 == this.aClass121_4) {
			this.aStringArray19 = new String[] { null, null, null, null, null, Static50.aClass43_22.method596(this.anInt4540) };
		} else {
			this.aStringArray19 = new String[] { null, null, null, null, null, null };
		}
	}

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "(B)V")
	public void method4151() {
		@Pc(2) Class359 local2 = this.aClass359_32;
		synchronized (this.aClass359_32) {
			this.aClass359_32.method8511();
		}
		local2 = this.aClass359_33;
		synchronized (this.aClass359_33) {
			this.aClass359_33.method8511();
		}
		local2 = this.aClass359_34;
		synchronized (this.aClass359_34) {
			this.aClass359_34.method8511();
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(II)V")
	public void method4152() {
		@Pc(6) Class359 local6 = this.aClass359_32;
		synchronized (this.aClass359_32) {
			this.aClass359_32.method8502(5);
		}
		local6 = this.aClass359_33;
		synchronized (this.aClass359_33) {
			this.aClass359_33.method8502(5);
		}
		local6 = this.aClass359_34;
		synchronized (this.aClass359_34) {
			this.aClass359_34.method8502(5);
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)V")
	public void method4153() {
		@Pc(2) Class359 local2 = this.aClass359_32;
		synchronized (this.aClass359_32) {
			this.aClass359_32.method8507();
		}
		local2 = this.aClass359_33;
		synchronized (this.aClass359_33) {
			this.aClass359_33.method8507();
		}
		local2 = this.aClass359_34;
		synchronized (this.aClass359_34) {
			this.aClass359_34.method8507();
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IB)V")
	public void method4154(@OriginalArg(0) int arg0) {
		this.anInt4547 = arg0;
		@Pc(20) Class359 local20 = this.aClass359_33;
		synchronized (this.aClass359_33) {
			this.aClass359_33.method8507();
		}
		local20 = this.aClass359_34;
		synchronized (this.aClass359_34) {
			this.aClass359_34.method8507();
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(B)V")
	public void method4155() {
		@Pc(2) Class359 local2 = this.aClass359_33;
		synchronized (this.aClass359_33) {
			this.aClass359_33.method8507();
		}
		local2 = this.aClass359_34;
		synchronized (this.aClass359_34) {
			this.aClass359_34.method8507();
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IZ)V")
	public void method4156(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean352 != arg0) {
			this.aBoolean352 = arg0;
			this.method4153();
		}
	}

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "(II)Lclient!qca;")
	public Class294 method4157(@OriginalArg(1) int arg0) {
		@Pc(15) Class359 local15 = this.aClass359_32;
		@Pc(25) Class294 local25;
		synchronized (this.aClass359_32) {
			local25 = (Class294) this.aClass359_32.method8517((long) arg0);
		}
		if (local25 != null) {
			return local25;
		}
		@Pc(39) Class223 local39 = this.aClass223_51;
		@Pc(52) byte[] local52;
		synchronized (this.aClass223_51) {
			local52 = this.aClass223_51.method5267(Static5.method41(arg0), Static429.method6564(arg0));
		}
		local25 = new Class294();
		local25.anInt8167 = arg0;
		local25.aClass164_2 = this;
		local25.aStringArray34 = (String[]) this.aStringArray19.clone();
		if (local52 != null) {
			local25.method7164(new Class6_Sub15(local52));
		}
		local25.method7160();
		@Pc(91) Class359 local91 = this.aClass359_32;
		synchronized (this.aClass359_32) {
			this.aClass359_32.method8515((long) arg0, local25);
			return local25;
		}
	}
}
