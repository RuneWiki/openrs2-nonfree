import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!su")
public final class Class284_Sub1 extends Class284 implements KeyListener, FocusListener {

	@OriginalMember(owner = "client!su", name = "A", descriptor = "Ljava/awt/Component;")
	private Component aComponent4;

	@OriginalMember(owner = "client!su", name = "v", descriptor = "Lclient!jia;")
	private final Class193 aClass193_58 = new Class193();

	@OriginalMember(owner = "client!su", name = "y", descriptor = "Lclient!jia;")
	private final Class193 aClass193_59 = new Class193();

	@OriginalMember(owner = "client!su", name = "B", descriptor = "[Z")
	private final boolean[] aBooleanArray25 = new boolean[112];

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
	public Class284_Sub1(@OriginalArg(0) Component arg0) {
		Static588.method7908();
		this.method7638(arg0);
	}

	@OriginalMember(owner = "client!su", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public void focusGained(@OriginalArg(0) FocusEvent arg0) {
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method7633() {
		this.aClass193_58.method4458();
		for (@Pc(22) Class3_Sub37 local22 = (Class3_Sub37) this.aClass193_59.method4452(); local22 != null; local22 = (Class3_Sub37) this.aClass193_59.method4452()) {
			local22.anInt6786 = this.method7639();
			if (local22.anInt6787 == 0) {
				if (!this.aBooleanArray25[local22.anInt6783]) {
					@Pc(130) Class3_Sub37 local130 = new Class3_Sub37();
					local130.anInt6787 = 0;
					local130.aLong184 = local22.aLong184;
					local130.anInt6783 = local22.anInt6783;
					local130.aChar2 = '\u0000';
					local130.anInt6786 = local22.anInt6786;
					this.aClass193_58.method4462(local130);
					this.aBooleanArray25[local22.anInt6783] = true;
				}
				local22.anInt6787 = 2;
				this.aClass193_58.method4462(local22);
			} else if (local22.anInt6787 == 1) {
				if (this.aBooleanArray25[local22.anInt6783]) {
					this.aClass193_58.method4462(local22);
					this.aBooleanArray25[local22.anInt6783] = false;
				}
			} else if (local22.anInt6787 == -1) {
				for (@Pc(55) int local55 = 0; local55 < 112; local55++) {
					if (this.aBooleanArray25[local55]) {
						@Pc(66) Class3_Sub37 local66 = new Class3_Sub37();
						local66.anInt6786 = local22.anInt6786;
						local66.anInt6787 = 1;
						local66.anInt6783 = local55;
						local66.aChar2 = '\u0000';
						local66.aLong184 = local22.aLong184;
						this.aClass193_58.method4462(local66);
						this.aBooleanArray25[local55] = false;
					}
				}
			} else if (local22.anInt6787 == 3) {
				this.aClass193_58.method4462(local22);
			}
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(ILjava/awt/Component;)V")
	private void method7638(@OriginalArg(1) Component arg0) {
		this.method7644();
		this.aComponent4 = arg0;
		@Pc(11) Method local11 = Static353.aMethod1;
		if (local11 != null) {
			try {
				local11.invoke(this.aComponent4, Boolean.FALSE);
			} catch (@Pc(31) Throwable local31) {
			}
		}
		this.aComponent4.addKeyListener(this);
		this.aComponent4.addFocusListener(this);
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(Z)V")
	@Override
	public void method7634() {
		this.method7644();
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(B)Lclient!ofa;")
	@Override
	public Interface18 method7632() {
		return (Interface18) this.aClass193_58.method4452();
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method7637(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 112 ? this.aBooleanArray25[arg0] : false;
	}

	@OriginalMember(owner = "client!su", name = "d", descriptor = "(I)I")
	private int method7639() {
		@Pc(5) int local5 = 0;
		if (this.aBooleanArray25[81]) {
			local5 = 1;
		}
		if (this.aBooleanArray25[82]) {
			local5 |= 0x4;
		}
		if (this.aBooleanArray25[86]) {
			local5 |= 0x2;
		}
		return local5;
	}

	@OriginalMember(owner = "client!su", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		this.method7642(0, arg0);
	}

	@OriginalMember(owner = "client!su", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyReleased(@OriginalArg(0) KeyEvent arg0) {
		this.method7642(1, arg0);
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IILjava/awt/event/KeyEvent;)V")
	private void method7642(@OriginalArg(1) int arg0, @OriginalArg(2) KeyEvent arg1) {
		@Pc(12) int local12 = arg1.getKeyCode();
		if (local12 == 0) {
			local12 = 0;
		} else if (local12 >= 0 && Static349.anIntArray402.length > local12) {
			local12 = Static349.anIntArray402[local12];
			if (arg0 == 0 && (local12 & 0x80) != 0) {
				local12 = 0;
			} else {
				local12 &= 0xFFFFFF7F;
			}
		} else {
			local12 = 0;
		}
		if (local12 != 0) {
			this.method7643(arg0, local12, '\u0000');
			arg1.consume();
		}
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IIZC)V")
	private void method7643(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) char arg2) {
		@Pc(12) Class3_Sub37 local12 = new Class3_Sub37();
		local12.anInt6787 = arg0;
		local12.aChar2 = arg2;
		local12.anInt6783 = arg1;
		local12.aLong184 = Static131.method2268();
		this.aClass193_59.method4462(local12);
	}

	@OriginalMember(owner = "client!su", name = "b", descriptor = "(B)V")
	private void method7644() {
		if (this.aComponent4 == null) {
			return;
		}
		this.aComponent4.removeKeyListener(this);
		this.aComponent4.removeFocusListener(this);
		this.aComponent4 = null;
		for (@Pc(26) int local26 = 0; local26 < 112; local26++) {
			this.aBooleanArray25[local26] = false;
		}
		this.aClass193_58.method4458();
		this.aClass193_59.method4458();
	}

	@OriginalMember(owner = "client!su", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
	@Override
	public synchronized void keyTyped(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) char local6 = arg0.getKeyChar();
		if (local6 != '\u0000' && Static406.method5786(local6)) {
			this.method7643(3, -1, local6);
			arg0.consume();
		}
	}

	@OriginalMember(owner = "client!su", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
	@Override
	public synchronized void focusLost(@OriginalArg(0) FocusEvent arg0) {
		this.method7643(-1, 0, '\u0000');
	}
}
