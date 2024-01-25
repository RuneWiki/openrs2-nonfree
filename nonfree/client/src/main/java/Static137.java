import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_53 = new Class265(100, -2);

	@OriginalMember(owner = "client!gv", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString35 = "";

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(B)V")
	public static void method2320() {
		if (Static150.aFrame5 != null) {
			return;
		}
		@Pc(13) int local13 = Static434.anInt7172;
		@Pc(15) int local15 = Static11.anInt287;
		@Pc(23) int local23 = Static15.anInt349 - local13 - Static86.anInt4394;
		@Pc(31) int local31 = Static6.anInt215 - local15 - Static395.anInt6582;
		if (local13 <= 0 && local23 <= 0 && local15 <= 0 && local31 <= 0) {
			return;
		}
		try {
			@Pc(46) Container local46;
			if (Static149.aFrame4 == null) {
				local46 = Static43.aClass59_5.anApplet1;
			} else {
				local46 = Static149.aFrame4;
			}
			@Pc(53) int local53 = 0;
			@Pc(55) int local55 = 0;
			if (Static149.aFrame4 == local46) {
				@Pc(61) Insets local61 = Static149.aFrame4.getInsets();
				local53 = local61.left;
				local55 = local61.top;
			}
			@Pc(70) Graphics local70 = local46.getGraphics();
			local70.setColor(Color.black);
			if (local13 > 0) {
				local70.fillRect(local53, local55, local13, Static6.anInt215);
			}
			if (local15 > 0) {
				local70.fillRect(local53, local55, Static15.anInt349, local15);
			}
			if (local23 > 0) {
				local70.fillRect(Static15.anInt349 + local53 - local23, local55, local23, Static6.anInt215);
			}
			if (local31 > 0) {
				local70.fillRect(local53, local55 + Static6.anInt215 - local31, Static15.anInt349, local31);
				return;
			}
		} catch (@Pc(124) Exception local124) {
			return;
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(IB)[B")
	public static synchronized byte[] method2322(@OriginalArg(0) int arg0) {
		@Pc(18) byte[] local18;
		if (arg0 == 100 && Static323.anInt5619 > 0) {
			local18 = Static444.aByteArrayArray60[--Static323.anInt5619];
			Static444.aByteArrayArray60[Static323.anInt5619] = null;
			return local18;
		} else if (arg0 == 5000 && Static46.anInt853 > 0) {
			local18 = Static395.aByteArrayArray50[--Static46.anInt853];
			Static395.aByteArrayArray50[Static46.anInt853] = null;
			return local18;
		} else if (arg0 == 30000 && Static386.anInt6467 > 0) {
			local18 = Static379.aByteArrayArray49[--Static386.anInt6467];
			Static379.aByteArrayArray49[Static386.anInt6467] = null;
			return local18;
		} else {
			return new byte[arg0];
		}
	}
}
