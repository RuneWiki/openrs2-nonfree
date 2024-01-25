import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hs")
public final class Class112 {

	@OriginalMember(owner = "client!hs", name = "i", descriptor = "[J")
	public static final long[] aLongArray4 = new long[256];

	@OriginalMember(owner = "client!hs", name = "e", descriptor = "Lclient!er;")
	private final Class69 aClass69_34 = new Class69(64);

	@OriginalMember(owner = "client!hs", name = "k", descriptor = "I")
	public int anInt2988 = 0;

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "Lclient!ns;")
	private final Class166 aClass166_115;

	@OriginalMember(owner = "client!hs", name = "g", descriptor = "I")
	public final int anInt2985;

	static {
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(8) long local8 = (long) local4;
			for (@Pc(10) int local10 = 0; local10 < 8; local10++) {
				if ((local8 & 0x1L) == 1L) {
					local8 = local8 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local8 >>>= 0x1;
				}
			}
			aLongArray4[local4] = local8;
		}
		new Class242("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
	}

	@OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(Lclient!go;ILclient!ns;)V")
	public Class112(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class166 arg2) {
		this.aClass166_115 = arg2;
		this.anInt2985 = this.aClass166_115.method3691(4);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ZI)V")
	public void method2330() {
		@Pc(10) Class69 local10 = this.aClass69_34;
		synchronized (this.aClass69_34) {
			this.aClass69_34.method1594(5);
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(II)Lclient!cw;")
	public Class42 method2332(@OriginalArg(1) int arg0) {
		@Pc(6) Class69 local6 = this.aClass69_34;
		@Pc(16) Class42 local16;
		synchronized (this.aClass69_34) {
			local16 = (Class42) this.aClass69_34.method1591((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(33) byte[] local33 = this.aClass166_115.method3696(arg0, 4);
		local16 = new Class42();
		local16.anInt1638 = arg0;
		local16.aClass112_2 = this;
		if (local33 != null) {
			local16.method1237(new Class4_Sub30(local33));
		}
		local16.method1238();
		@Pc(60) Class69 local60 = this.aClass69_34;
		synchronized (this.aClass69_34) {
			this.aClass69_34.method1590((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!hs", name = "c", descriptor = "(I)V")
	public void method2333() {
		@Pc(2) Class69 local2 = this.aClass69_34;
		synchronized (this.aClass69_34) {
			this.aClass69_34.method1600();
		}
	}

	@OriginalMember(owner = "client!hs", name = "d", descriptor = "(I)V")
	public void method2334() {
		@Pc(6) Class69 local6 = this.aClass69_34;
		synchronized (this.aClass69_34) {
			this.aClass69_34.method1593();
		}
	}
}
