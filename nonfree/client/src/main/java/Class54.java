import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class54 implements Runnable {

	@OriginalMember(owner = "client!db", name = "b", descriptor = "[J")
	public static final long[] aLongArray1 = new long[11];

	@OriginalMember(owner = "client!db", name = "g", descriptor = "[[J")
	public static final long[][] aLongArrayArray1 = new long[8][256];

	@OriginalMember(owner = "client!db", name = "i", descriptor = "Lclient!bu;")
	private final Class38 aClass38_18 = new Class38();

	@OriginalMember(owner = "client!db", name = "j", descriptor = "Ljava/lang/Thread;")
	private Thread aThread1 = new Thread(this);

	static {
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(17) char local17 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ\u2e4b﹗ᕷ㟥\u9ff0䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c\ufd4d鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(local10 / 2);
			@Pc(30) long local30 = (long) ((local10 & 0x1) == 0 ? local17 >>> 8 : local17 & 0xFF);
			@Pc(34) long local34 = local30 << 1;
			if (local34 >= 256L) {
				local34 ^= 0x11DL;
			}
			@Pc(46) long local46 = local34 << 1;
			if (local46 >= 256L) {
				local46 ^= 0x11DL;
			}
			@Pc(58) long local58 = local46 ^ local30;
			@Pc(62) long local62 = local46 << 1;
			if (local62 >= 256L) {
				local62 ^= 0x11DL;
			}
			@Pc(74) long local74 = local30 ^ local62;
			aLongArrayArray1[0][local10] = Static537.method7854(local74, Static537.method7854(Static537.method7854(local58 << 16, Static537.method7854(Static537.method7854(Static537.method7854(Static537.method7854(local30 << 56, local30 << 48), local46 << 40), local30 << 32), local62 << 24)), local34 << 8));
			for (@Pc(110) int local110 = 1; local110 < 8; local110++) {
				aLongArrayArray1[local110][local10] = Static537.method7854(aLongArrayArray1[local110 - 1][local10] >>> 8, aLongArrayArray1[local110 - 1][local10] << 56);
			}
		}
		aLongArray1[0] = 0L;
		for (@Pc(153) int local153 = 1; local153 <= 10; local153++) {
			@Pc(160) int local160 = (local153 - 1) * 8;
			aLongArray1[local153] = Static402.method7868(Static402.method7868(Static402.method7868(Static402.method7868(Static264.method4397(aLongArrayArray1[4][local160 + 4], 4278190080L), Static402.method7868(Static264.method4397(1095216660480L, aLongArrayArray1[3][local160 + 3]), Static402.method7868(Static402.method7868(Static264.method4397(-72057594037927936L, aLongArrayArray1[0][local160]), Static264.method4397(71776119061217280L, aLongArrayArray1[1][local160 + 1])), Static264.method4397(aLongArrayArray1[2][local160 + 2], 280375465082880L)))), Static264.method4397(16711680L, aLongArrayArray1[5][local160 + 5])), Static264.method4397(aLongArrayArray1[6][local160 + 6], 65280L)), Static264.method4397(aLongArrayArray1[7][local160 + 7], 255L));
		}
	}

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V")
	public Class54() {
		this.aThread1.setDaemon(true);
		this.aThread1.start();
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V")
	public void method1971() {
		if (this.aThread1 == null) {
			return;
		}
		this.method1972(new Class1());
		try {
			this.aThread1.join();
		} catch (@Pc(26) InterruptedException local26) {
		}
		this.aThread1 = null;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!kp;I)V")
	private void method1972(@OriginalArg(0) Class1 arg0) {
		@Pc(6) Class38 local6 = this.aClass38_18;
		synchronized (this.aClass38_18) {
			this.aClass38_18.method1426(arg0);
			this.aClass38_18.notify();
		}
	}

	@OriginalMember(owner = "client!db", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(8) Class38 local8 = this.aClass38_18;
			@Pc(38) Class1_Sub36 local38;
			synchronized (this.aClass38_18) {
				@Pc(15) Class1 local15;
				for (local15 = this.aClass38_18.method1423(); local15 == null; local15 = this.aClass38_18.method1423()) {
					try {
						this.aClass38_18.wait();
					} catch (@Pc(22) InterruptedException local22) {
					}
				}
				if (!(local15 instanceof Class1_Sub36)) {
					return;
				}
				local38 = (Class1_Sub36) local15;
			}
			@Pc(64) int local64;
			try {
				@Pc(49) byte[] local49 = InetAddress.getByName(local38.aString61).getAddress();
				local64 = jagmisc.ping(local49[0], local49[1], local49[2], local49[3], 1000L);
			} catch (@Pc(66) Throwable local66) {
				local64 = 1000;
			}
			local38.anInt6597 = local64;
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ILjava/lang/String;)Lclient!pn;")
	public Class1_Sub36 method1976(@OriginalArg(1) String arg0) {
		if (this.aThread1 == null) {
			throw new IllegalStateException("");
		} else if (arg0 == null) {
			throw new IllegalArgumentException("");
		} else {
			@Pc(23) Class1_Sub36 local23 = new Class1_Sub36(arg0);
			this.method1972(local23);
			return local23;
		}
	}
}
