import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class168 {

	@OriginalMember(owner = "client!md", name = "k", descriptor = "[I")
	public static final int[] anIntArray389 = new int[4096];

	@OriginalMember(owner = "client!md", name = "f", descriptor = "Lclient!sm;")
	public Class227 aClass227_4;

	@OriginalMember(owner = "client!md", name = "i", descriptor = "I")
	public int anInt4342;

	@OriginalMember(owner = "client!md", name = "e", descriptor = "I")
	public int anInt4340 = 16;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "I")
	public int anInt4337 = 128;

	@OriginalMember(owner = "client!md", name = "b", descriptor = "Z")
	public boolean aBoolean315 = false;

	@OriginalMember(owner = "client!md", name = "j", descriptor = "Z")
	public boolean aBoolean317 = true;

	@OriginalMember(owner = "client!md", name = "g", descriptor = "I")
	public int anInt4341 = 8;

	@OriginalMember(owner = "client!md", name = "h", descriptor = "Z")
	public boolean aBoolean316 = true;

	@OriginalMember(owner = "client!md", name = "r", descriptor = "I")
	public int anInt4349 = -1;

	@OriginalMember(owner = "client!md", name = "p", descriptor = "I")
	public int anInt4347 = 1190717;

	@OriginalMember(owner = "client!md", name = "v", descriptor = "I")
	public int anInt4353 = -1;

	@OriginalMember(owner = "client!md", name = "m", descriptor = "I")
	public int anInt4344 = -1;

	@OriginalMember(owner = "client!md", name = "c", descriptor = "I")
	public int anInt4338 = 0;

	@OriginalMember(owner = "client!md", name = "y", descriptor = "I")
	public int anInt4354 = 127;

	static {
		for (@Pc(4) int local4 = 0; local4 < 4096; local4++) {
			anIntArray389[local4] = Static268.method3717(local4);
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BLclient!hw;)V")
	public void method3489(@OriginalArg(1) Class2_Sub17 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method6138();
			if (local13 == 0) {
				return;
			}
			this.method3496(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(B)V")
	public void method3493() {
		if (this.anInt4353 == -1) {
			this.anInt4353 = this.anInt4349;
		}
		this.anInt4341 = this.anInt4342 | this.anInt4341 << 8;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IILclient!hw;)V")
	private void method3496(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub17 arg1) {
		if (arg0 == 1) {
			this.anInt4338 = Static431.method5868(arg1.method6145());
		} else if (arg0 == 2) {
			this.anInt4349 = arg1.method6138();
		} else if (arg0 == 3) {
			this.anInt4349 = arg1.method6148();
			if (this.anInt4349 == 65535) {
				this.anInt4349 = -1;
			}
		} else if (arg0 == 5) {
			this.aBoolean317 = false;
		} else if (arg0 == 7) {
			this.anInt4344 = Static431.method5868(arg1.method6145());
		} else if (arg0 == 8) {
			this.aClass227_4.anInt6582 = this.anInt4342;
		} else if (arg0 == 9) {
			this.anInt4337 = arg1.method6148() << 0;
		} else if (arg0 == 10) {
			this.aBoolean316 = false;
		} else if (arg0 == 11) {
			this.anInt4341 = arg1.method6138();
		} else if (arg0 == 12) {
			this.aBoolean315 = true;
		} else if (arg0 == 13) {
			this.anInt4347 = arg1.method6145();
		} else if (arg0 == 14) {
			this.anInt4340 = arg1.method6138() << 0;
		} else if (arg0 == 15) {
			this.anInt4353 = arg1.method6148();
			if (this.anInt4353 == 65535) {
				this.anInt4353 = -1;
			}
		} else if (arg0 == 16) {
			this.anInt4354 = arg1.method6138();
		}
	}
}
