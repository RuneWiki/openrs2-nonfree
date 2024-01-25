import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public final class Class178 {

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
	public int anInt5380;

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
	public int anInt5381;

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "I")
	public int anInt5382;

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
	public int anInt5383;

	@OriginalMember(owner = "client!lh", name = "g", descriptor = "I")
	public int anInt5385;

	@OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
	public int anInt5387;

	@OriginalMember(owner = "client!lh", name = "m", descriptor = "Lclient!lh;")
	public Class178 aClass178_2;

	@OriginalMember(owner = "client!lh", name = "n", descriptor = "I")
	public int anInt5391;

	@OriginalMember(owner = "client!lh", name = "p", descriptor = "I")
	public int anInt5393;

	@OriginalMember(owner = "client!lh", name = "s", descriptor = "I")
	public int anInt5395;

	@OriginalMember(owner = "client!lh", name = "q", descriptor = "I")
	public final int anInt5394;

	@OriginalMember(owner = "client!lh", name = "j", descriptor = "I")
	public final int anInt5388;

	@OriginalMember(owner = "client!lh", name = "h", descriptor = "I")
	public final int anInt5386;

	@OriginalMember(owner = "client!lh", name = "f", descriptor = "B")
	public final byte aByte61;

	@OriginalMember(owner = "client!lh", name = "l", descriptor = "I")
	private final int anInt5390;

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(IIIIB)V")
	public Class178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt5394 = arg1;
		this.anInt5388 = arg2;
		this.anInt5386 = arg3;
		this.aByte61 = arg4;
		this.anInt5390 = arg0;
	}

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Lclient!lh;I)V")
	public Class178(@OriginalArg(0) Class178 arg0, @OriginalArg(1) int arg1) {
		this.aClass178_2 = arg0;
		this.anInt5388 = this.aClass178_2.anInt5388 + arg1;
		this.aByte61 = this.aClass178_2.aByte61;
		this.anInt5390 = this.aClass178_2.anInt5390;
		this.anInt5394 = this.aClass178_2.anInt5394 + arg1;
		this.anInt5386 = this.aClass178_2.anInt5386 + arg1;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIII)Lclient!lh;")
	public Class178 method4675(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class178(this.anInt5390, arg2, arg1, arg0, this.aByte61);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)Lclient!gn;")
	public Class107 method4677() {
		return Static544.method7950(this.anInt5390);
	}
}
