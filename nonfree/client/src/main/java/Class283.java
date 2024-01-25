import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rca")
public final class Class283 {

	@OriginalMember(owner = "client!rca", name = "v", descriptor = "I")
	public int anInt8369;

	@OriginalMember(owner = "client!rca", name = "w", descriptor = "Lclient!hl;")
	public Class136 aClass136_5;

	@OriginalMember(owner = "client!rca", name = "f", descriptor = "Z")
	public boolean aBoolean565 = false;

	@OriginalMember(owner = "client!rca", name = "c", descriptor = "I")
	public int anInt8355 = 1190717;

	@OriginalMember(owner = "client!rca", name = "e", descriptor = "Z")
	public boolean aBoolean564 = true;

	@OriginalMember(owner = "client!rca", name = "i", descriptor = "I")
	public int anInt8358 = -1;

	@OriginalMember(owner = "client!rca", name = "p", descriptor = "I")
	public int anInt8363 = -1;

	@OriginalMember(owner = "client!rca", name = "n", descriptor = "I")
	public int anInt8361 = 8;

	@OriginalMember(owner = "client!rca", name = "h", descriptor = "Z")
	public boolean aBoolean566 = true;

	@OriginalMember(owner = "client!rca", name = "u", descriptor = "I")
	public int anInt8368 = 64;

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "I")
	public int anInt8353 = 0;

	@OriginalMember(owner = "client!rca", name = "t", descriptor = "I")
	public int anInt8367 = 512;

	@OriginalMember(owner = "client!rca", name = "x", descriptor = "I")
	public int anInt8370 = 127;

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(Z)V")
	public void method7213() {
		this.anInt8361 = this.anInt8369 | this.anInt8361 << 8;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lclient!rg;II)V")
	private void method7214(@OriginalArg(0) Class6_Sub40 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt8353 = Static533.method7861(arg0.method8606());
		} else if (arg1 == 2) {
			this.anInt8363 = arg0.method8604();
		} else if (arg1 == 3) {
			this.anInt8363 = arg0.method8571();
			if (this.anInt8363 == 65535) {
				this.anInt8363 = -1;
			}
		} else if (arg1 == 5) {
			this.aBoolean564 = false;
		} else if (arg1 == 7) {
			this.anInt8358 = Static533.method7861(arg0.method8606());
		} else if (arg1 == 8) {
			this.aClass136_5.anInt4231 = this.anInt8369;
		} else if (arg1 == 9) {
			this.anInt8367 = arg0.method8571() << 2;
		} else if (arg1 == 10) {
			this.aBoolean566 = false;
		} else if (arg1 == 11) {
			this.anInt8361 = arg0.method8604();
		} else if (arg1 == 12) {
			this.aBoolean565 = true;
		} else if (arg1 == 13) {
			this.anInt8355 = arg0.method8606();
		} else if (arg1 == 14) {
			this.anInt8368 = arg0.method8604() << 2;
		} else if (arg1 == 16) {
			this.anInt8370 = arg0.method8604();
		}
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lclient!rg;I)V")
	public void method7217(@OriginalArg(0) Class6_Sub40 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8604();
			if (local5 == 0) {
				return;
			}
			this.method7214(arg0, local5);
		}
	}
}
