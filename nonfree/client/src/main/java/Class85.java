import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eba")
public final class Class85 {

	@OriginalMember(owner = "client!eba", name = "r", descriptor = "I")
	public int anInt2505;

	@OriginalMember(owner = "client!eba", name = "p", descriptor = "Lclient!si;")
	private final Class338 aClass338_5 = new Class338(64);

	@OriginalMember(owner = "client!eba", name = "i", descriptor = "Lclient!si;")
	public final Class338 aClass338_6 = new Class338(50);

	@OriginalMember(owner = "client!eba", name = "d", descriptor = "Lclient!si;")
	public final Class338 aClass338_7 = new Class338(5);

	@OriginalMember(owner = "client!eba", name = "t", descriptor = "Z")
	public boolean aBoolean208;

	@OriginalMember(owner = "client!eba", name = "u", descriptor = "Lclient!lb;")
	private final Class221 aClass221_32;

	@OriginalMember(owner = "client!eba", name = "h", descriptor = "I")
	private final int anInt2503;

	@OriginalMember(owner = "client!eba", name = "w", descriptor = "Lclient!iga;")
	public final Class169 aClass169_3;

	@OriginalMember(owner = "client!eba", name = "k", descriptor = "Lclient!lb;")
	public final Class221 aClass221_33;

	@OriginalMember(owner = "client!eba", name = "l", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray5;

	@OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(Lclient!iga;IZLclient!lb;Lclient!lb;)V")
	public Class85(@OriginalArg(0) Class169 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class221 arg3, @OriginalArg(4) Class221 arg4) {
		this.aBoolean208 = arg2;
		this.aClass221_32 = arg3;
		this.anInt2503 = arg1;
		this.aClass169_3 = arg0;
		this.aClass221_33 = arg4;
		if (this.aClass221_32 != null) {
			@Pc(44) int local44 = this.aClass221_32.method5080() - 1;
			this.aClass221_32.method5065(local44);
		}
		if (Static615.aClass169_7 == this.aClass169_3) {
			this.aStringArray5 = new String[] { null, null, null, null, null, Static476.aClass279_22.method6992(this.anInt2503) };
		} else {
			this.aStringArray5 = new String[] { null, null, null, null, null, null };
		}
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(II)V")
	public void method2213() {
		@Pc(2) Class338 local2 = this.aClass338_5;
		synchronized (this.aClass338_5) {
			this.aClass338_5.method8052(5);
		}
		local2 = this.aClass338_6;
		synchronized (this.aClass338_6) {
			this.aClass338_6.method8052(5);
		}
		local2 = this.aClass338_7;
		synchronized (this.aClass338_7) {
			this.aClass338_7.method8052(5);
		}
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(BI)Lclient!at;")
	public Class18 method2214(@OriginalArg(1) int arg0) {
		@Pc(6) Class338 local6 = this.aClass338_5;
		@Pc(16) Class18 local16;
		synchronized (this.aClass338_5) {
			local16 = (Class18) this.aClass338_5.method8049((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class221 local30 = this.aClass221_32;
		@Pc(51) byte[] local51;
		synchronized (this.aClass221_32) {
			local51 = this.aClass221_32.method5089(Static262.method4071(arg0), Static686.method6328(arg0));
		}
		local16 = new Class18();
		local16.anInt466 = arg0;
		local16.aClass85_1 = this;
		local16.aStringArray1 = (String[]) this.aStringArray5.clone();
		if (local51 != null) {
			local16.method405(new Class3_Sub28(local51));
		}
		local16.method409();
		@Pc(90) Class338 local90 = this.aClass338_5;
		synchronized (this.aClass338_5) {
			this.aClass338_5.method8044((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!eba", name = "b", descriptor = "(B)V")
	public void method2215() {
		@Pc(2) Class338 local2 = this.aClass338_6;
		synchronized (this.aClass338_6) {
			this.aClass338_6.method8051();
		}
		local2 = this.aClass338_7;
		synchronized (this.aClass338_7) {
			this.aClass338_7.method8051();
		}
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(I)V")
	public void method2216() {
		@Pc(14) Class338 local14 = this.aClass338_5;
		synchronized (this.aClass338_5) {
			this.aClass338_5.method8047();
		}
		local14 = this.aClass338_6;
		synchronized (this.aClass338_6) {
			this.aClass338_6.method8047();
		}
		local14 = this.aClass338_7;
		synchronized (this.aClass338_7) {
			this.aClass338_7.method8047();
		}
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(B)V")
	public void method2217() {
		@Pc(6) Class338 local6 = this.aClass338_5;
		synchronized (this.aClass338_5) {
			this.aClass338_5.method8051();
		}
		local6 = this.aClass338_6;
		synchronized (this.aClass338_6) {
			this.aClass338_6.method8051();
		}
		local6 = this.aClass338_7;
		synchronized (this.aClass338_7) {
			this.aClass338_7.method8051();
		}
	}

	@OriginalMember(owner = "client!eba", name = "b", descriptor = "(II)V")
	public void method2219(@OriginalArg(1) int arg0) {
		this.anInt2505 = arg0;
		@Pc(9) Class338 local9 = this.aClass338_6;
		synchronized (this.aClass338_6) {
			this.aClass338_6.method8051();
		}
		local9 = this.aClass338_7;
		synchronized (this.aClass338_7) {
			this.aClass338_7.method8051();
		}
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(IZ)V")
	public void method2220(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean208) {
			this.aBoolean208 = arg0;
			this.method2217();
		}
	}
}
