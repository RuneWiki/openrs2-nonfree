import java.awt.Dimension;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!kp", name = "q", descriptor = "I")
	public static int anInt5708;

	@OriginalMember(owner = "client!kp", name = "m", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!kp", name = "n", descriptor = "Lclient!jk;")
	public static final Class173 aClass173_81 = new Class173(19, -1);

	@OriginalMember(owner = "client!kp", name = "o", descriptor = "[F")
	public static final float[] aFloatArray45 = new float[4];

	@OriginalMember(owner = "client!kp", name = "p", descriptor = "Lclient!jk;")
	public static final Class173 aClass173_82 = new Class173(46, 16);

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIB)I")
	public static int method4827(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static529.anInt9421 == -1) {
			return 1;
		}
		if (Static495.anInt9000 != arg1) {
			Static303.method5190(Static590.aClass364_17.method8334(Static154.anInt3181), arg1);
			if (arg1 != Static495.anInt9000) {
				return -1;
			}
		}
		try {
			@Pc(32) Dimension local32 = Static475.aCanvas12.getSize();
			Static85.method1575(Static440.aClass44_12, Static272.aClass58_5, true, Static238.aClass114_9, Static590.aClass364_17.method8334(Static154.anInt3181));
			@Pc(48) Class191 local48 = Static91.method5485(Static309.aClass176_81, Static529.anInt9421);
			@Pc(51) long local51 = Static574.method8210();
			Static440.aClass44_12.JA();
			Static267.aClass8_3.NA(0, Static96.anInt8036, 0);
			Static440.aClass44_12.method4999(Static267.aClass8_3);
			Static440.aClass44_12.la(local32.width / 2, local32.height / 2, 512, 512);
			Static440.aClass44_12.ra(1.0F);
			Static440.aClass44_12.VA(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			@Pc(92) Class57 local92 = Static440.aClass44_12.method5016(local48, 2048, 64, 64, 768);
			@Pc(94) int local94 = 0;
			label41: for (@Pc(96) int local96 = 0; local96 < 500; local96++) {
				Static440.aClass44_12.ja(0);
				Static440.aClass44_12.ya();
				for (@Pc(105) int local105 = 15; local105 >= 0; local105--) {
					for (@Pc(109) int local109 = 0; local109 <= local105; local109++) {
						Static410.aClass8_6.NA((int) ((float) anInt5708 * ((float) local109 - (float) local105 / 2.0F)), 0, (local105 + 1) * anInt5708);
						local92.method7927(Static410.aClass8_6, null, 0);
						local94++;
						if (Static574.method8210() - local51 >= (long) arg0) {
							break label41;
						}
					}
				}
			}
			Static440.aClass44_12.method5032();
			@Pc(184) long local184 = (long) (local94 * 1000) / (Static574.method8210() - local51);
			Static440.aClass44_12.ja(0);
			Static440.aClass44_12.ya();
			return (int) local184;
		} catch (@Pc(193) Throwable local193) {
			local193.printStackTrace();
			return -1;
		}
	}
}
