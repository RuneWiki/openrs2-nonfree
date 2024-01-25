import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "[F")
	public static final float[] aFloatArray58 = new float[4];

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger7 = new BigInteger("872e690c95e9bcd312aaff6dc60e7c7be762c1cc09b2701fc04df154a7d2400afb49aff0463dd91d8e47886bf4571430aaf7d16193e9f6ad6d7c5d0ba37b5beb56f1f879e639ee470b24ea83b460b0ecabfa5600e3da39051c41fd188240a99e20f22acd0918aa931a052bc502edb422e1132941755ab2ce11717264867b3d1fa25d2b0e45a0445eb2701006d2bd7eff059f73a18dadd0e9809aa8cb1f9df067b6513c05c778a318999410808f2aa1a28085c3f6349560708ed814738746e8ec5aea9720c2d46a07d6a1506302ea8b0384cc86dba4fdb81aa4dd715e83ade5f3b386a75d5501dd12c291e33f63eecfc3ac5928ef3ecd027e3b069fad7ed72c40276b421f94ab6c183c12830baf30a856e257370799a5fda6ebc4f062e4fa3341e23f6e7c36376034e7dcb0358a3c748a690a9441bb92411cdf6a2efb9483be8d415cc0511f1cceb8f74dfaef79040ac2493fdb2fa3faeae5c95305a2d46805c52c6f859d732d5ff60dede0f73f1ad67fda15fbe2de3462ec3126c3c7ed8d8a6ad6e40afc76f811a9248b790972160fd67e731c86601e8df63b06921909634c99b11896dd99d3660a217712ec567792672668a357451aecfc578530f7b3edd4a57e9dd798a605d0cbda6c2331566bbc1dadc9f30d82fecb0b4b9c1d34be9069740b25f7fbe213128def7e8f6d5889319cc9b8124c5f9f4f4dc6a545789cc9bee1", 16);

	@OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
	public static int anInt7933 = 0;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)Z")
	public static boolean method6552() {
		if (Static116.aBoolean192) {
			try {
				Static682.method5126("showVideoAd", Static645.anApplet2);
				return true;
			} catch (@Pc(15) Throwable local15) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IZ)V")
	public static void method6553(@OriginalArg(0) int arg0) {
		Static517.anInt9046 = arg0;
		Static367.anInt6812 = -1;
		Static367.anInt6812 = -1;
		Static27.method617();
	}
}
