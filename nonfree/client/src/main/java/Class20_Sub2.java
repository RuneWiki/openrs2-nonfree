import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ir")
public abstract class Class20_Sub2 extends Class20 {

	@OriginalMember(owner = "client!ir", name = "j", descriptor = "I")
	public int anInt8787;

	@OriginalMember(owner = "client!ir", name = "k", descriptor = "I")
	public int anInt8788;

	@OriginalMember(owner = "client!ir", name = "l", descriptor = "B")
	public byte aByte116;

	@OriginalMember(owner = "client!ir", name = "m", descriptor = "B")
	public byte aByte117;

	@OriginalMember(owner = "client!ir", name = "o", descriptor = "I")
	public int anInt8790;

	@OriginalMember(owner = "client!ir", name = "p", descriptor = "Z")
	public boolean aBoolean644;

	@OriginalMember(owner = "client!ir", name = "q", descriptor = "I")
	public int anInt8791;

	@OriginalMember(owner = "client!ir", name = "x", descriptor = "I")
	public int anInt8795;

	@OriginalMember(owner = "client!ir", name = "y", descriptor = "I")
	public int anInt8796;

	@OriginalMember(owner = "client!ir", name = "<init>", descriptor = "()V")
	protected Class20_Sub2() {
	}

	@OriginalMember(owner = "client!ir", name = "f", descriptor = "(I)Z")
	public abstract boolean method7249();

	@OriginalMember(owner = "client!ir", name = "h", descriptor = "(I)Z")
	public abstract boolean method7252();

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(BLclient!r;)Lclient!qw;")
	public abstract Class20_Sub8 method7253(@OriginalArg(1) Class12 arg0);

	@OriginalMember(owner = "client!ir", name = "i", descriptor = "(I)Z")
	public abstract boolean method7254();

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(ZLclient!r;II)Z")
	public abstract boolean method7255(@OriginalArg(1) Class12 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!ir", name = "j", descriptor = "(I)Z")
	public abstract boolean method7256();

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(ILclient!ir;ZILclient!r;IB)V")
	public abstract void method7257(@OriginalArg(0) int arg0, @OriginalArg(1) Class20_Sub2 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class12 arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "([Lclient!qea;B)I")
	public abstract int method7258(@OriginalArg(0) Class1_Sub5[] arg0);

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Z)Z")
	public abstract boolean method7259();

	@OriginalMember(owner = "client!ir", name = "l", descriptor = "(I)I")
	public abstract int method7261(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(Lclient!r;I)Lclient!cu;")
	public abstract Class60 method7262(@OriginalArg(0) Class12 arg0);

	@OriginalMember(owner = "client!ir", name = "c", descriptor = "(B)V")
	public abstract void method7263();

	@OriginalMember(owner = "client!ir", name = "d", descriptor = "(B)I")
	public abstract int method7264();

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lclient!r;Z)V")
	public abstract void method7265(@OriginalArg(0) Class12 arg0);

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(I[Lclient!qea;II)I")
	protected final int method7266(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub5[] arg1, @OriginalArg(3) int arg2) {
		@Pc(19) long local19 = Static579.aLongArrayArrayArray1[this.aByte116][arg0][arg2];
		@Pc(21) long local21 = 0L;
		@Pc(23) int local23 = 0;
		@Pc(33) int local33;
		while (local21 <= 48L) {
			local33 = (int) (local19 >> (int) local21 & 0xFFFFL);
			if (local33 <= 0) {
				break;
			}
			local21 += 16L;
			arg1[local23++] = Static502.aClass237Array1[local33 - 1].aClass1_Sub5_1;
		}
		for (local33 = local23; local33 < 4; local33++) {
			arg1[local33] = null;
		}
		return local23;
	}
}
