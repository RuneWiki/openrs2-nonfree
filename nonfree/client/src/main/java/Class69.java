import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class69 {

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
	public int anInt1936;

	@OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
	public int anInt1940;

	@OriginalMember(owner = "client!ff", name = "i", descriptor = "I")
	public int anInt1941;

	@OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
	public int anInt1942;

	@OriginalMember(owner = "client!ff", name = "k", descriptor = "I")
	public int anInt1943;

	@OriginalMember(owner = "client!ff", name = "l", descriptor = "I")
	public int anInt1944;

	@OriginalMember(owner = "client!ff", name = "m", descriptor = "I")
	public int anInt1945;

	@OriginalMember(owner = "client!ff", name = "n", descriptor = "J")
	public long aLong75;

	@OriginalMember(owner = "client!ff", name = "p", descriptor = "I")
	public int anInt1946;

	@OriginalMember(owner = "client!ff", name = "r", descriptor = "I")
	private int anInt1948;

	@OriginalMember(owner = "client!ff", name = "s", descriptor = "I")
	public int anInt1949;

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
	public int anInt1938 = 0;

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "Z")
	private boolean aBoolean117 = false;

	@OriginalMember(owner = "client!ff", name = "q", descriptor = "I")
	public int anInt1947 = 0;

	static {
		new Class174("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILclient!nj;)V")
	public void method1800(@OriginalArg(1) Class3_Sub25 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4096();
			if (local5 == 0) {
				return;
			}
			this.method1801(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZLclient!nj;I)V")
	private void method1801(@OriginalArg(1) Class3_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1948 = arg0.method4083();
		} else if (arg1 == 2) {
			arg0.method4096();
		} else if (arg1 == 3) {
			this.anInt1940 = arg0.method4108();
			this.anInt1936 = arg0.method4108();
			this.anInt1945 = arg0.method4108();
		} else if (arg1 == 4) {
			this.anInt1942 = arg0.method4096();
			this.anInt1943 = arg0.method4108();
		} else if (arg1 == 6) {
			this.anInt1949 = arg0.method4096();
		} else if (arg1 == 8) {
			this.anInt1947 = 1;
		} else if (arg1 == 9) {
			this.anInt1938 = 1;
		} else if (arg1 == 10) {
			this.aBoolean117 = true;
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)V")
	public void method1803() {
		this.anInt1941 = Class65.anIntArray87[this.anInt1948 << 3];
		this.anInt1944 = (int) Math.sqrt((double) (this.anInt1945 * this.anInt1945 + this.anInt1936 * this.anInt1936 + this.anInt1940 * this.anInt1940));
		if (this.anInt1943 == 0) {
			this.anInt1943 = 1;
		}
		if (this.anInt1942 == 0) {
			this.aLong75 = 2147483647L;
		} else if (this.anInt1942 == 1) {
			this.aLong75 = this.anInt1944 * 8 / this.anInt1943;
			this.aLong75 *= this.aLong75;
		} else if (this.anInt1942 == 2) {
			this.aLong75 = this.anInt1944 * 8 / this.anInt1943;
		}
		if (this.aBoolean117) {
			this.anInt1944 *= -1;
		}
	}
}
