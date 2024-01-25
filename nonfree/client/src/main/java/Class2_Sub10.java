import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kj")
public class Class2_Sub10 extends Class2 {

	@OriginalMember(owner = "client!kj", name = "A", descriptor = "[B")
	public static final byte[] aByteArray116;

	@OriginalMember(owner = "client!kj", name = "r", descriptor = "J")
	public long aLong206;

	@OriginalMember(owner = "client!kj", name = "v", descriptor = "Lclient!kj;")
	public Class2_Sub10 aClass2_Sub10_53;

	@OriginalMember(owner = "client!kj", name = "w", descriptor = "Lclient!kj;")
	public Class2_Sub10 aClass2_Sub10_54;

	static {
		@Pc(65) int local65 = 0;
		aByteArray116 = new byte[32896];
		for (@Pc(70) int local70 = 0; local70 < 256; local70++) {
			for (@Pc(73) int local73 = 0; local73 <= local70; local73++) {
				aByteArray116[local65++] = (byte) (255.0D / Math.sqrt((double) ((float) (local73 * local73 + local70 * local70 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "(B)V")
	public final void method5572() {
		if (this.aClass2_Sub10_54 != null) {
			this.aClass2_Sub10_54.aClass2_Sub10_53 = this.aClass2_Sub10_53;
			this.aClass2_Sub10_53.aClass2_Sub10_54 = this.aClass2_Sub10_54;
			this.aClass2_Sub10_53 = null;
			this.aClass2_Sub10_54 = null;
		}
	}

	@OriginalMember(owner = "client!kj", name = "c", descriptor = "(B)Z")
	public final boolean method5573() {
		return this.aClass2_Sub10_54 != null;
	}
}
