import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kaa")
public final class Class34_Sub2 extends Class34 implements Interface18 {

	@OriginalMember(owner = "client!kaa", name = "w", descriptor = "[C")
	private static final char[] aCharArray3 = new char[64];

	@OriginalMember(owner = "client!kaa", name = "o", descriptor = "I")
	private int anInt5920;

	static {
		for (@Pc(8) int local8 = 0; local8 < 26; local8++) {
			aCharArray3[local8] = (char) (local8 + 65);
		}
		for (@Pc(24) int local24 = 26; local24 < 52; local24++) {
			aCharArray3[local24] = (char) (local24 + 71);
		}
		for (@Pc(40) int local40 = 52; local40 < 62; local40++) {
			aCharArray3[local40] = (char) (local40 - 4);
		}
		aCharArray3[63] = '-';
		aCharArray3[62] = '*';
	}

	@OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "(Lclient!qo;I[BIZ)V")
	public Class34_Sub2(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt5920 = arg1;
	}

	@OriginalMember(owner = "client!kaa", name = "d", descriptor = "(I)V")
	@Override
	protected void method5098() {
		super.aClass20_Sub3_22.method7380(this);
	}

	@OriginalMember(owner = "client!kaa", name = "b", descriptor = "(I)I")
	@Override
	public int method9226() {
		return this.anInt5920;
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "([BIII)V")
	@Override
	public void method9227(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		this.method5096(arg0, arg1);
		this.anInt5920 = 5123;
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I)I")
	@Override
	public int method9225() {
		return super.anInt5915;
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(B)J")
	@Override
	public long method9228() {
		return 0L;
	}
}
