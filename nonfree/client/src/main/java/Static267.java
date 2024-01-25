import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "Lclient!et;")
	public static Class91 aClass91_9;

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray7 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "[I")
	public static final int[] anIntArray424 = new int[4096];

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I[BZI)Ljava/lang/String;")
	public static String method4736(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(8) char[] local8 = new char[arg2];
		@Pc(19) int local19 = 0;
		@Pc(23) int local23 = arg2 + arg0;
		for (@Pc(25) int local25 = arg0; local25 < local23; local25++) {
			@Pc(33) int local33 = arg1[local25] & 0xFF;
			if (local33 >= 128) {
				if (local33 < 194) {
					throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + local33);
				}
				@Pc(66) int local66;
				if (local33 >= 224) {
					if (local33 >= 240) {
						if (local33 >= 244) {
							throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + local33);
						}
						throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
					}
					if (local23 <= local25 + 2) {
						throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
					}
					local25++;
					local66 = arg1[local25] & 0xFF;
					if (local66 < 128 || local66 > 191) {
						throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
					}
					local25++;
					@Pc(84) int local84 = arg1[local25] & 0xFF;
					if (local84 < 128 || local84 > 191) {
						throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
					}
					local8[local19++] = (char) ((local33 & 0xFFF1F) << 12 | (local66 & 0xFFFFFF7F) << 6 | local84 & 0xFFFFFF7F);
				} else if (local25 + 1 < local23) {
					local25++;
					local66 = arg1[local25] & 0xFF;
					if (local66 < 128 || local66 > 191) {
						throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
					}
					local8[local19++] = (char) ((local33 & 0x3FFFF3F) << 6 | local66 & 0xFFFFFF7F);
				} else {
					throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
				}
			} else {
				local8[local19++] = (char) local33;
			}
		}
		return new String(local8, 0, local19);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(BLclient!mh;)V")
	public static void method4737(@OriginalArg(1) Class4_Sub3 arg0) {
		@Pc(16) byte[] local16;
		if (Static318.anObject10 == null) {
			@Pc(9) Class35_Sub2_Sub2 local9 = new Class35_Sub2_Sub2();
			local16 = local9.method5910();
			Static318.anObject10 = Static271.method4827(local16);
		}
		if (Static305.anObject9 == null) {
			@Pc(27) Class35_Sub1_Sub1 local27 = new Class35_Sub1_Sub1();
			local16 = local27.method3754();
			Static305.anObject9 = Static271.method4827(local16);
		}
		@Pc(46) Class16 local46 = arg0.aClass16_1;
		if (local46.method590() && Static415.anObject12 == null) {
			local16 = Static164.method2942(0.5F, new Class157_Sub1(419684), 16.0F, 4.0F, 0.6F, 4.0F);
			Static415.anObject12 = Static271.method4827(local16);
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/awt/Color;ZIILjava/awt/Color;Ljava/awt/Color;Ljava/lang/String;)V")
	public static void method4740(@OriginalArg(0) Color arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Color arg3, @OriginalArg(5) Color arg4, @OriginalArg(6) String arg5) {
		try {
			@Pc(2) Graphics local2 = Static312.aCanvas12.getGraphics();
			if (Static164.aFont1 == null) {
				Static164.aFont1 = new Font("Helvetica", 1, 13);
			}
			if (arg1) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static70.anInt1753, Static508.anInt8910);
			}
			if (arg3 == null) {
				arg3 = new Color(140, 17, 17);
			}
			if (arg4 == null) {
				arg4 = new Color(140, 17, 17);
			}
			if (arg0 == null) {
				arg0 = new Color(255, 255, 255);
			}
			try {
				if (Static446.anImage2 == null) {
					Static446.anImage2 = Static312.aCanvas12.createImage(304, 34);
				}
				@Pc(59) Graphics local59 = Static446.anImage2.getGraphics();
				local59.setColor(arg4);
				local59.drawRect(0, 0, 303, 33);
				local59.setColor(arg3);
				local59.fillRect(2, 2, arg2 * 3, 30);
				local59.setColor(Color.black);
				local59.drawRect(1, 1, 301, 31);
				local59.fillRect(arg2 * 3 + 2, 2, 300 - arg2 * 3, 30);
				local59.setFont(Static164.aFont1);
				local59.setColor(arg0);
				local59.drawString(arg5, (304 - arg5.length() * 6) / 2, 22);
				local2.drawImage(Static446.anImage2, Static70.anInt1753 / 2 - 152, Static508.anInt8910 / 2 + -18, null);
			} catch (@Pc(139) Exception local139) {
				@Pc(145) int local145 = Static70.anInt1753 / 2 - 152;
				@Pc(151) int local151 = Static508.anInt8910 / 2 - 18;
				local2.setColor(arg4);
				local2.drawRect(0, 0, 303, 33);
				local2.setColor(arg3);
				local2.fillRect(local145 + 2, local151 + 2, arg2 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local145 + 1, local151 + 1, 301, 31);
				local2.fillRect(arg2 * 3 + local145 + 2, local151 + 2, 300 - arg2 * 3, 30);
				local2.setFont(Static164.aFont1);
				local2.setColor(arg0);
				local2.drawString(arg5, (304 - arg5.length() * 6) / 2 + local145, local151 - -22);
			}
			if (Static382.aString174 != null) {
				local2.setFont(Static164.aFont1);
				local2.setColor(arg0);
				local2.drawString(Static382.aString174, Static70.anInt1753 / 2 - Static382.aString174.length() * 6 / 2, Static508.anInt8910 / 2 + -26);
			}
		} catch (@Pc(258) Exception local258) {
			Static312.aCanvas12.repaint();
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)I")
	public static int method4741(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static417.anInt7305 == -1) {
			return 1;
		}
		if (Static449.anInt7876 != arg0) {
			Static124.method2356(arg0);
			if (arg0 != Static449.anInt7876) {
				return -1;
			}
		}
		try {
			@Pc(32) Dimension local32 = Static312.aCanvas12.getSize();
			Static433.method6712(Static219.aClass45_62.method1474(Static544.anInt7853), true, Static186.aClass36_1);
			@Pc(46) Class81 local46 = Static274.method4851(Static417.anInt7305, Static408.aClass69_78);
			@Pc(49) long local49 = Static110.method2222();
			Static455.aClass4_11.n();
			Static224.aClass128_5.oa(0, Static270.anInt5197, 0);
			Static455.aClass4_11.method7198(Static224.aClass128_5);
			Static455.aClass4_11.b(local32.width / 2, local32.height / 2, 512, 512);
			Static455.aClass4_11.M(1.0F);
			Static455.aClass4_11.m(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			@Pc(90) Class97 local90 = Static455.aClass4_11.method7192(local46, 2048, 64, 64, 768);
			@Pc(97) int local97 = 0;
			label41: for (@Pc(99) int local99 = 0; local99 < 500; local99++) {
				Static455.aClass4_11.Z(0);
				Static455.aClass4_11.method7202();
				for (@Pc(108) int local108 = 15; local108 >= 0; local108--) {
					for (@Pc(112) int local112 = 0; local112 <= local108; local112++) {
						Static437.aClass128_7.oa((int) ((float) Static382.anInt6794 * ((float) local112 - (float) local108 / 2.0F)), 0, (local108 + 1) * Static382.anInt6794);
						local90.method6773(Static437.aClass128_7, null, 0);
						local97++;
						if (Static110.method2222() - local49 >= (long) arg1) {
							break label41;
						}
					}
				}
			}
			Static455.aClass4_11.method7221();
			@Pc(180) long local180 = (long) (local97 * 1000) / (Static110.method2222() - local49);
			Static455.aClass4_11.Z(0);
			Static455.aClass4_11.method7202();
			return (int) local180;
		} catch (@Pc(189) Throwable local189) {
			local189.printStackTrace();
			return -1;
		}
	}
}
