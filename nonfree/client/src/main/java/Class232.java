import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!us")
public final class Class232 {

	@OriginalMember(owner = "client!us", name = "a", descriptor = "I")
	private int anInt5951;

	@OriginalMember(owner = "client!us", name = "b", descriptor = "Lclient!rl;")
	public Class210 aClass210_2;

	@OriginalMember(owner = "client!us", name = "d", descriptor = "I")
	public int anInt5953;

	@OriginalMember(owner = "client!us", name = "e", descriptor = "I")
	public int anInt5954;

	static {
		new Class32("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(ILclient!kk;)V")
	public void method5191(@OriginalArg(1) Class2_Sub16 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method5350();
			if (local17 == 0) {
				return;
			}
			this.method5194(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Lclient!kk;II)V")
	private void method5194(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt5951 = arg0.method5312();
		} else if (arg1 == 2) {
			this.anInt5953 = arg0.method5350();
			this.anInt5954 = arg0.method5350();
		}
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(I)Lclient!gm;")
	public synchronized Class86 method5195() {
		@Pc(13) Class86 local13 = (Class86) this.aClass210_2.aClass160_48.method3599((long) this.anInt5951);
		if (local13 != null) {
			return local13;
		}
		local13 = Static397.method2330(this.aClass210_2.aClass171_79, this.anInt5951, 0);
		if (local13 != null) {
			this.aClass210_2.aClass160_48.method3602((long) this.anInt5951, local13);
		}
		return local13;
	}
}
