import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public final class Class2_Sub31 extends Class2 {

	@OriginalMember(owner = "client!ps", name = "v", descriptor = "Ljava/lang/String;")
	public final String aString52;

	@OriginalMember(owner = "client!ps", name = "o", descriptor = "I")
	public int anInt5368;

	@OriginalMember(owner = "client!ps", name = "w", descriptor = "I")
	public final int anInt5372;

	@OriginalMember(owner = "client!ps", name = "y", descriptor = "J")
	public final long aLong163;

	@OriginalMember(owner = "client!ps", name = "t", descriptor = "Ljava/lang/String;")
	public String aString51;

	@OriginalMember(owner = "client!ps", name = "q", descriptor = "I")
	public final int anInt5369;

	@OriginalMember(owner = "client!ps", name = "r", descriptor = "I")
	public final int anInt5370;

	@OriginalMember(owner = "client!ps", name = "u", descriptor = "Z")
	public final boolean aBoolean469;

	@OriginalMember(owner = "client!ps", name = "n", descriptor = "Z")
	public final boolean aBoolean468;

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIJIIZZ)V")
	public Class2_Sub31(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) long arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) boolean arg8) {
		this.aString52 = arg0;
		this.anInt5368 = arg3;
		this.anInt5372 = arg2;
		this.aLong163 = arg4;
		this.aString51 = arg1;
		this.anInt5369 = arg5;
		this.anInt5370 = arg6;
		this.aBoolean469 = arg8;
		this.aBoolean468 = arg7;
	}
}
