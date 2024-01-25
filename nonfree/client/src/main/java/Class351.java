import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class351 {

	@OriginalMember(owner = "client!we", name = "d", descriptor = "Lclient!nfa;")
	public Class228 aClass228_2;

	@OriginalMember(owner = "client!we", name = "g", descriptor = "I")
	private int anInt10200;

	@OriginalMember(owner = "client!we", name = "i", descriptor = "I")
	public int anInt10202;

	@OriginalMember(owner = "client!we", name = "j", descriptor = "I")
	public int anInt10203;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!fd;I)V")
	public void method8265(@OriginalArg(0) Class3_Sub7 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method6538();
			if (local15 == 0) {
				return;
			}
			this.method8269(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(B)Lclient!aw;")
	public synchronized Class20 method8266() {
		@Pc(18) Class20 local18 = (Class20) this.aClass228_2.aClass211_48.method5534((long) this.anInt10200);
		if (local18 != null) {
			return local18;
		}
		local18 = Static599.method814(this.aClass228_2.aClass254_96, this.anInt10200, 0);
		if (local18 != null) {
			this.aClass228_2.aClass211_48.method5529((long) this.anInt10200, local18);
		}
		return local18;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!fd;II)V")
	private void method8269(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt10200 = arg0.method6535();
		} else if (arg1 == 2) {
			this.anInt10202 = arg0.method6538();
			this.anInt10203 = arg0.method6538();
		}
	}
}
