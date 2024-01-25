import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public final class Class142 {

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
	public int anInt4535;

	@OriginalMember(owner = "client!ig", name = "h", descriptor = "I")
	public int anInt4541;

	@OriginalMember(owner = "client!ig", name = "i", descriptor = "Lclient!ig;")
	public Class142 aClass142_1;

	@OriginalMember(owner = "client!ig", name = "l", descriptor = "I")
	public int anInt4543;

	@OriginalMember(owner = "client!ig", name = "n", descriptor = "I")
	public int anInt4545;

	@OriginalMember(owner = "client!ig", name = "o", descriptor = "I")
	public int anInt4546;

	@OriginalMember(owner = "client!ig", name = "p", descriptor = "I")
	public int anInt4547;

	@OriginalMember(owner = "client!ig", name = "q", descriptor = "I")
	public int anInt4548;

	@OriginalMember(owner = "client!ig", name = "s", descriptor = "I")
	public int anInt4550;

	@OriginalMember(owner = "client!ig", name = "t", descriptor = "I")
	public int anInt4551;

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
	private final int anInt4539;

	@OriginalMember(owner = "client!ig", name = "g", descriptor = "I")
	public final int anInt4540;

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
	public final int anInt4538;

	@OriginalMember(owner = "client!ig", name = "j", descriptor = "B")
	public final byte aByte61;

	@OriginalMember(owner = "client!ig", name = "k", descriptor = "I")
	public final int anInt4542;

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(IIIIB)V")
	public Class142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt4539 = arg0;
		this.anInt4540 = arg2;
		this.anInt4538 = arg1;
		this.aByte61 = arg4;
		this.anInt4542 = arg3;
	}

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Lclient!ig;I)V")
	public Class142(@OriginalArg(0) Class142 arg0, @OriginalArg(1) int arg1) {
		this.aClass142_1 = arg0;
		this.anInt4539 = this.aClass142_1.anInt4539;
		this.aByte61 = this.aClass142_1.aByte61;
		this.anInt4540 = arg1 + this.aClass142_1.anInt4540;
		this.anInt4538 = arg1 + this.aClass142_1.anInt4538;
		this.anInt4542 = arg1 + this.aClass142_1.anInt4542;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIII)Lclient!ig;")
	public Class142 method3821(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return new Class142(this.anInt4539, arg1, arg0, arg2, this.aByte61);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)Lclient!tb;")
	public Class282 method3822() {
		return Static365.method5703(this.anInt4539);
	}
}
