import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class46 implements Runnable {

	@OriginalMember(owner = "client!cd", name = "g", descriptor = "[I")
	public static final int[] anIntArray156 = new int[128];

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "Lclient!ae;")
	public Class9 aClass9_5;

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "[Lclient!nm;")
	public final Class146[] aClass146Array1 = new Class146[2];

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "Z")
	public volatile boolean aBoolean64 = false;

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "Z")
	public volatile boolean aBoolean65 = false;

	static {
		for (@Pc(4) int local4 = 0; local4 < anIntArray156.length; local4++) {
			anIntArray156[local4] = -1;
		}
		for (@Pc(20) int local20 = 65; local20 <= 90; local20++) {
			anIntArray156[local20] = local20 - 65;
		}
		for (@Pc(35) int local35 = 97; local35 <= 122; local35++) {
			anIntArray156[local35] = local35 - 71;
		}
		for (@Pc(48) int local48 = 48; local48 <= 57; local48++) {
			anIntArray156[local48] = local48 + 4;
		}
		anIntArray156[45] = anIntArray156[47] = 63;
		anIntArray156[42] = anIntArray156[43] = 62;
		new Class40("You can't reach that.", "Da kommst du nicht hin.", "Vous ne pouvez pas l'atteindre.", "Você não consegue alcançar isso.");
	}

	@OriginalMember(owner = "client!cd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		this.aBoolean65 = true;
		try {
			while (!this.aBoolean64) {
				for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
					@Pc(19) Class146 local19 = this.aClass146Array1[local12];
					if (local19 != null) {
						local19.method5765();
					}
				}
				Static213.method3465(10L);
				Static153.method2805(this.aClass9_5, null);
			}
		} catch (@Pc(41) Exception local41) {
			Static370.method6434(null, local41);
		} finally {
			@Pc(51) Object local51 = null;
			this.aBoolean65 = false;
		}
	}
}
