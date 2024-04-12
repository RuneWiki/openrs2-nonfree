import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class30 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
	public static int anInt1171 = 0;

	@OriginalMember(owner = "client!ka", name = "i", descriptor = "Lclient!o;")
	public static Class40 aClass40_359 = Static12.method257("null");

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "[I")
	public static int[] anIntArray257 = new int[] { 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800 };

	@OriginalMember(owner = "client!ka", name = "m", descriptor = "[I")
	public static int[] anIntArray258 = new int[1000];

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "Lclient!o;")
	public static Class40 aClass40_358 = Static12.method257("Cancel");

	@OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
	public static int anInt1175 = 0;

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "Z")
	public static boolean aBoolean95 = false;

	@OriginalMember(owner = "client!ka", name = "q", descriptor = "Lclient!o;")
	public static Class40 aClass40_361 = Static12.method257("Please wait)3)3)3");

	@OriginalMember(owner = "client!ka", name = "j", descriptor = "Lclient!o;")
	public static Class40 aClass40_360 = Static12.method257("::hiddenbuttontest");

	@OriginalMember(owner = "client!ka", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 48)
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		arg0.consume();
	}

	@OriginalMember(owner = "client!ka", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 105)
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		if (Class41.aClass30_1 != null) {
			Class2_Sub2_Sub8.anInt949 = -1;
		}
	}

	@OriginalMember(owner = "client!ka", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 155)
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		if (Class41.aClass30_1 != null) {
			Class12_Sub1.anInt1860 = 0;
			@Pc(10) int local10 = arg0.getKeyCode();
			if (local10 >= 0 && Class63.anIntArray549.length > local10) {
				local10 = Class63.anIntArray549[local10] & 0xFFFFFF7F;
			} else {
				local10 = -1;
			}
			if (Class2_Sub2_Sub8.anInt949 >= 0 && local10 >= 0) {
				Class45.anIntArray470[Class2_Sub2_Sub8.anInt949] = ~local10;
				Class2_Sub2_Sub8.anInt949 = Class2_Sub2_Sub8.anInt949 + 1 & 0x7F;
				if (Class2_Sub2_Sub8.anInt949 == Class2_Sub2_Sub12_Sub1_Sub2.anInt2342) {
					Class2_Sub2_Sub8.anInt949 = -1;
				}
			}
		}
		arg0.consume();
	}

	@OriginalMember(owner = "client!ka", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 187)
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!ka", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 265)
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		if (Class41.aClass30_1 != null) {
			Class12_Sub1.anInt1860 = 0;
			@Pc(8) int local8 = arg0.getKeyCode();
			if (local8 >= 0 && local8 < Class63.anIntArray549.length) {
				local8 = Class63.anIntArray549[local8];
				if ((local8 & 0x80) != 0) {
					local8 = -1;
				}
			} else {
				local8 = -1;
			}
			@Pc(49) int local49;
			if (local8 == 85 || local8 == 80 || local8 == 84 || local8 == 0 || local8 == 101) {
				local49 = -1;
			} else {
				local49 = Static40.method1243(arg0);
			}
			if (Class2_Sub2_Sub8.anInt949 >= 0 && local8 >= 0) {
				Class45.anIntArray470[Class2_Sub2_Sub8.anInt949] = local8;
				Class2_Sub2_Sub8.anInt949 = Class2_Sub2_Sub8.anInt949 + 1 & 0x7F;
				if (Class2_Sub2_Sub12_Sub1_Sub2.anInt2342 == Class2_Sub2_Sub8.anInt949) {
					Class2_Sub2_Sub8.anInt949 = -1;
				}
			}
			if (local8 >= 0 || local49 >= 0) {
				@Pc(93) int local93 = Class2_Sub2_Sub12_Sub6.anInt2226 + 1 & 0x7F;
				if (Class27.anInt1094 != local93) {
					Class54.anIntArray453[Class2_Sub2_Sub12_Sub6.anInt2226] = local8;
					Class2_Sub2_Sub16.anIntArray545[Class2_Sub2_Sub12_Sub6.anInt2226] = local49;
					Class2_Sub2_Sub12_Sub6.anInt2226 = local93;
				}
			}
		}
		arg0.consume();
	}
}
