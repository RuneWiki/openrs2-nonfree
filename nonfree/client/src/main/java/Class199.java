import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!to")
public final class Class199 {

	@OriginalMember(owner = "client!to", name = "e", descriptor = "I")
	public int anInt5853 = -1;

	@OriginalMember(owner = "client!to", name = "l", descriptor = "I")
	public int anInt5857 = -1;

	@OriginalMember(owner = "client!to", name = "k", descriptor = "Z")
	public boolean aBoolean513 = false;

	@OriginalMember(owner = "client!to", name = "h", descriptor = "Z")
	public boolean aBoolean512 = true;

	@OriginalMember(owner = "client!to", name = "o", descriptor = "Z")
	public boolean aBoolean514 = true;

	@OriginalMember(owner = "client!to", name = "p", descriptor = "I")
	public int anInt5859 = 16;

	@OriginalMember(owner = "client!to", name = "s", descriptor = "I")
	public int anInt5862 = 8;

	@OriginalMember(owner = "client!to", name = "r", descriptor = "I")
	public int anInt5861 = -1;

	@OriginalMember(owner = "client!to", name = "u", descriptor = "I")
	public int anInt5864 = 1190717;

	@OriginalMember(owner = "client!to", name = "v", descriptor = "I")
	public int anInt5865 = 0;

	@OriginalMember(owner = "client!to", name = "i", descriptor = "I")
	public int anInt5856 = 128;

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(II)V")
	public void method5144(@OriginalArg(0) int arg0) {
		this.anInt5862 = this.anInt5862 << 8 | arg0;
		if (this.anInt5857 == -1) {
			this.anInt5857 = this.anInt5861;
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ILclient!eb;I)V")
	public void method5147(@OriginalArg(1) Class1_Sub7 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(18) int local18 = arg0.method3141();
			if (local18 == 0) {
				return;
			}
			this.method5148(arg1, local18, arg0);
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IIILclient!eb;)V")
	private void method5148(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub7 arg2) {
		if (arg1 == 1) {
			this.anInt5865 = Static74.method3131(arg2.method3137());
		} else if (arg1 == 2) {
			this.anInt5861 = arg2.method3141();
		} else if (arg1 == 3) {
			this.anInt5861 = arg2.method3115();
			if (this.anInt5861 == 65535) {
				this.anInt5861 = -1;
			}
		} else if (arg1 == 5) {
			this.aBoolean514 = false;
		} else if (arg1 == 7) {
			this.anInt5853 = Static74.method3131(arg2.method3137());
		} else if (arg1 == 8) {
			Static145.anInt2851 = arg0;
		} else if (arg1 == 9) {
			this.anInt5856 = arg2.method3115();
		} else if (arg1 == 10) {
			this.aBoolean512 = false;
		} else if (arg1 == 11) {
			this.anInt5862 = arg2.method3141();
		} else if (arg1 == 12) {
			this.aBoolean513 = true;
		} else if (arg1 == 13) {
			this.anInt5864 = arg2.method3137();
		} else if (arg1 == 14) {
			this.anInt5859 = arg2.method3141();
		} else if (arg1 == 15) {
			this.anInt5857 = arg2.method3115();
			if (this.anInt5857 == 65535) {
				this.anInt5857 = -1;
			}
		}
	}
}
