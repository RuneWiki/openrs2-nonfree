import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class230 {

	@OriginalMember(owner = "client!ng", name = "s", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "Lclient!cp;")
	public Class59 aClass59_6;

	@OriginalMember(owner = "client!ng", name = "l", descriptor = "I")
	public int anInt6400;

	@OriginalMember(owner = "client!ng", name = "f", descriptor = "Z")
	public boolean aBoolean502 = true;

	@OriginalMember(owner = "client!ng", name = "j", descriptor = "I")
	public int anInt6398 = -1;

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
	public int anInt6392 = 512;

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
	public int anInt6391 = 127;

	@OriginalMember(owner = "client!ng", name = "q", descriptor = "I")
	public int anInt6404 = -1;

	@OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
	public int anInt6395 = 8;

	@OriginalMember(owner = "client!ng", name = "p", descriptor = "Z")
	public boolean aBoolean503 = true;

	@OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
	public int anInt6393 = 0;

	@OriginalMember(owner = "client!ng", name = "n", descriptor = "I")
	public int anInt6402 = 1190717;

	@OriginalMember(owner = "client!ng", name = "r", descriptor = "Z")
	public boolean aBoolean504 = false;

	@OriginalMember(owner = "client!ng", name = "m", descriptor = "I")
	public int anInt6401 = 64;

	static {
		for (@Pc(4) int local4 = 0; local4 < 100; local4++) {
			aRectangleArray1[local4] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!es;II)V")
	private void method5306(@OriginalArg(0) Class2_Sub15 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt6393 = Static556.method7588(arg0.method4341());
		} else if (arg1 == 2) {
			this.anInt6404 = arg0.method4325();
		} else if (arg1 == 3) {
			this.anInt6404 = arg0.method4294();
			if (this.anInt6404 == 65535) {
				this.anInt6404 = -1;
			}
		} else if (arg1 == 5) {
			this.aBoolean503 = false;
		} else if (arg1 == 7) {
			this.anInt6398 = Static556.method7588(arg0.method4341());
		} else if (arg1 == 8) {
			this.aClass59_6.anInt1601 = this.anInt6400;
		} else if (arg1 == 9) {
			this.anInt6392 = arg0.method4294() << 2;
		} else if (arg1 == 10) {
			this.aBoolean502 = false;
		} else if (arg1 == 11) {
			this.anInt6395 = arg0.method4325();
		} else if (arg1 == 12) {
			this.aBoolean504 = true;
		} else if (arg1 == 13) {
			this.anInt6402 = arg0.method4341();
		} else if (arg1 == 14) {
			this.anInt6401 = arg0.method4325() << 2;
		} else if (arg1 == 16) {
			this.anInt6391 = arg0.method4325();
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
	public void method5307() {
		this.anInt6395 = this.anInt6395 << 8 | this.anInt6400;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!es;I)V")
	public void method5308(@OriginalArg(0) Class2_Sub15 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4325();
			if (local5 == 0) {
				return;
			}
			this.method5306(arg0, local5);
		}
	}
}
