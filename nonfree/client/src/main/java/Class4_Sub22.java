import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pv")
public final class Class4_Sub22 extends Class4 {

	@OriginalMember(owner = "client!pv", name = "o", descriptor = "[B")
	public static final byte[] aByteArray72 = new byte[32896];

	static {
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			for (@Pc(18) int local18 = 0; local18 <= local15; local18++) {
				aByteArray72[local13++] = (byte) (int) (255.0D / Math.sqrt((double) ((float) (local18 * local18 + local15 * local15 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(Lclient!w;)V")
	public Class4_Sub22(@OriginalArg(0) Class2_Sub54 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(ILclient!w;)V")
	public Class4_Sub22(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub54 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "(I)I")
	public int method7520() {
		return super.anInt10787;
	}

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "(II)I")
	@Override
	public int method9223(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "(Z)V")
	@Override
	public void method9225() {
		if (super.anInt10787 < 0 && super.anInt10787 > 127) {
			super.anInt10787 = this.method9221();
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(BI)V")
	@Override
	protected void method9227(@OriginalArg(1) int arg0) {
		super.anInt10787 = arg0;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(Z)I")
	@Override
	protected int method9221() {
		return 127;
	}
}
