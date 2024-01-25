import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public abstract class Class22_Sub5 extends Class22 {

	@OriginalMember(owner = "client!f", name = "w", descriptor = "[J")
	public static final long[] aLongArray10 = new long[256];

	@OriginalMember(owner = "client!f", name = "s", descriptor = "I")
	public int anInt6336;

	@OriginalMember(owner = "client!f", name = "v", descriptor = "I")
	public int anInt6339;

	@OriginalMember(owner = "client!f", name = "B", descriptor = "I")
	public int anInt6344;

	@OriginalMember(owner = "client!f", name = "C", descriptor = "I")
	protected final int anInt6345;

	@OriginalMember(owner = "client!f", name = "z", descriptor = "I")
	public final int anInt6342;

	@OriginalMember(owner = "client!f", name = "E", descriptor = "I")
	public int anInt6347;

	@OriginalMember(owner = "client!f", name = "D", descriptor = "I")
	public final int anInt6346;

	static {
		for (@Pc(8) int local8 = 0; local8 < 256; local8++) {
			@Pc(12) long local12 = (long) local8;
			for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
				if ((local12 & 0x1L) == 1L) {
					local12 = local12 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local12 >>>= 0x1;
				}
			}
			aLongArray10[local8] = local12;
		}
	}

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(IIIIIII)V")
	protected Class22_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt6336 = arg2;
		this.anInt6339 = arg5;
		this.anInt6344 = arg0;
		this.anInt6345 = arg1;
		this.anInt6342 = arg3;
		this.anInt6347 = arg4;
		this.anInt6346 = arg6;
	}

	@OriginalMember(owner = "client!f", name = "g", descriptor = "(I)I")
	public abstract int method5351();

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ZILclient!hh;Lclient!pe;III)V")
	@Override
	public final void method5340(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class22 arg1, @OriginalArg(3) Class89 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(B)V")
	@Override
	public final void method5338() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!f", name = "e", descriptor = "(I)Z")
	@Override
	public final boolean method5343() {
		return false;
	}
}
