import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!du")
public final class Class52 {

	@OriginalMember(owner = "client!du", name = "o", descriptor = "[B")
	public static final byte[] aByteArray21;

	@OriginalMember(owner = "client!du", name = "f", descriptor = "S")
	public final short aShort12;

	@OriginalMember(owner = "client!du", name = "b", descriptor = "Z")
	public final boolean aBoolean130;

	@OriginalMember(owner = "client!du", name = "m", descriptor = "B")
	public final byte aByte10;

	@OriginalMember(owner = "client!du", name = "h", descriptor = "I")
	public final int anInt1859;

	@OriginalMember(owner = "client!du", name = "j", descriptor = "S")
	public final short aShort13;

	@OriginalMember(owner = "client!du", name = "k", descriptor = "B")
	public final byte aByte9;

	@OriginalMember(owner = "client!du", name = "a", descriptor = "S")
	public final short aShort11;

	static {
		new Class21(null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", null, null);
		aByteArray21 = new byte[32896];
		@Pc(70) int local70 = 0;
		for (@Pc(72) int local72 = 0; local72 < 256; local72++) {
			for (@Pc(75) int local75 = 0; local75 <= local72; local75++) {
				aByteArray21[local70++] = (byte) (255.0D / Math.sqrt((double) ((float) (local75 * local75 + local72 * local72 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!du", name = "<init>", descriptor = "(IIIIIIIIIZ)V")
	public Class52(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		this.aShort12 = (short) arg4;
		this.aBoolean130 = arg9;
		this.aByte10 = (byte) arg8;
		this.anInt1859 = arg0;
		this.aShort13 = (short) arg5;
		this.aByte9 = (byte) arg7;
		this.aShort11 = (short) arg6;
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(ZIIII)Lclient!du;")
	public Class52 method1643(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return new Class52(arg2, arg3, arg1, arg0, this.aShort12, this.aShort13, this.aShort11, this.aByte9, this.aByte10, this.aBoolean130);
	}
}
