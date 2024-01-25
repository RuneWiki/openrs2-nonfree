import java.awt.Frame;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!an", name = "w", descriptor = "I")
	public static int anInt457;

	@OriginalMember(owner = "client!an", name = "q", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_7 = new Class181(82, 3);

	@OriginalMember(owner = "client!an", name = "u", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_8 = new Class181(22, 7);

	@OriginalMember(owner = "client!an", name = "v", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("a95bee1fdce5febeee57b1f1ca72319164191fec5223dde2db33a4f8526f5d7b77ba7964409689a064d0f2318f33b6c8ec48e8d1fbd0b10d3c6299791b2bfe21654b19c3146e13b77819363116031cef43f2b8c49874056befd4cc02c2c589760a1b836d2f40636a9a265b13a41f0d8ae22bc54893f791ddca9420efe557986ae594e717b026a4dc435b5e14bc9ae5ed7da61ac1d5da61d32493a5121ab21cfae9d7b75d42dbad28e951ccfe428328879564472b8e8f7d9f177d248ec5b2c0ebcf7a6da8c39cb69c89ebcc52636c742bcffb58e1c4fa4258e6e437b4e6744cea279bcc5f3c79f70d4eb946b3b6e9a43edb7864bd8ac298b6b21a2a4fc5d7625843dd8161a64122fe7987d79f860ca73cfa3f6a9be9945d2576bb7fbadf820d33d229ec021562c63d2bc0edd5adbdc322d0eacf1484f0d95de58fbf91e9c52ef47cb929fd1ebb2d70de6fabef5270a83c17013e811e90ff27806652cb8e1656cce20215fcc3494414c13fa5566ea0c5e30fa71d5c4eaac0372c6cbc611aab92331fd49205b64bbcbc4a195471aafd30cd243c676d17659a916f8196e56c4d59f6f997b064e34eb4ac07fb22a311f386ac8821f8d787919526a39c67a3a1e2516c7dea4626b5ef17b72fb4f1afb3d8b44801862ef4a6e86cd88b95f5ddc904df8826627d640fecc78204fff6968bf56ff5c0f260b56f0e3b9bda4753d2c238ba17", 16);

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(III)Lclient!jg;")
	public static Class14_Sub1_Sub4 method481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class156 local7 = Static535.aClass156ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class14_Sub1_Sub4 local14 = local7.aClass14_Sub1_Sub4_1;
			local7.aClass14_Sub1_Sub4_1 = null;
			Static139.method2092(local14);
			return local14;
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IIIILclient!kk;I)Ljava/awt/Frame;")
	public static Frame method483(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class192 arg2, @OriginalArg(5) int arg3) {
		if (!arg2.method4325()) {
			return null;
		}
		@Pc(20) Class380[] local20 = Static392.method6100(arg2);
		if (local20 == null) {
			return null;
		}
		@Pc(26) boolean local26 = false;
		for (@Pc(28) int local28 = 0; local28 < local20.length; local28++) {
			if (arg0 == local20[local28].anInt10349 && arg3 == local20[local28].anInt10348 && (!local26 || arg1 < local20[local28].anInt10353)) {
				local26 = true;
				arg1 = local20[local28].anInt10353;
			}
		}
		if (!local26) {
			return null;
		}
		@Pc(97) Class330 local97 = arg2.method4336(arg0, arg3, arg1);
		while (local97.anInt9132 == 0) {
			Static452.method7478(10L);
		}
		@Pc(112) Frame local112 = (Frame) local97.anObject19;
		if (local112 == null) {
			return null;
		} else if (local97.anInt9132 == 2) {
			Static373.method5812(arg2, local112);
			return null;
		} else {
			return local112;
		}
	}
}
