import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!po")
public final class Class267 {

	@OriginalMember(owner = "client!po", name = "c", descriptor = "I")
	public int anInt8077;

	@OriginalMember(owner = "client!po", name = "d", descriptor = "I")
	public int anInt8078;

	@OriginalMember(owner = "client!po", name = "e", descriptor = "I")
	public int anInt8079;

	@OriginalMember(owner = "client!po", name = "h", descriptor = "I")
	public int anInt8082;

	@OriginalMember(owner = "client!po", name = "j", descriptor = "I")
	public int anInt8084;

	@OriginalMember(owner = "client!po", name = "l", descriptor = "I")
	public int anInt8086;

	@OriginalMember(owner = "client!po", name = "m", descriptor = "I")
	public int anInt8087;

	@OriginalMember(owner = "client!po", name = "o", descriptor = "J")
	public long aLong200;

	@OriginalMember(owner = "client!po", name = "p", descriptor = "I")
	private int anInt8089;

	@OriginalMember(owner = "client!po", name = "q", descriptor = "I")
	public int anInt8090;

	@OriginalMember(owner = "client!po", name = "r", descriptor = "I")
	public int anInt8091;

	@OriginalMember(owner = "client!po", name = "k", descriptor = "I")
	public int anInt8085 = 0;

	@OriginalMember(owner = "client!po", name = "f", descriptor = "I")
	public int anInt8080 = 0;

	@OriginalMember(owner = "client!po", name = "v", descriptor = "Z")
	private boolean aBoolean574 = false;

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Lclient!cea;IB)V")
	private void method6899(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt8089 = arg0.method8326();
		} else if (arg1 == 2) {
			arg0.method8383();
		} else if (arg1 == 3) {
			this.anInt8079 = arg0.method8381();
			this.anInt8078 = arg0.method8381();
			this.anInt8082 = arg0.method8381();
		} else if (arg1 == 4) {
			this.anInt8077 = arg0.method8383();
			this.anInt8091 = arg0.method8381();
		} else if (arg1 == 6) {
			this.anInt8084 = arg0.method8383();
		} else if (arg1 == 8) {
			this.anInt8085 = 1;
		} else if (arg1 == 9) {
			this.anInt8080 = 1;
		} else if (arg1 == 10) {
			this.aBoolean574 = true;
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(ILclient!cea;)V")
	public void method6900(@OriginalArg(1) Class2_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8383();
			if (local5 == 0) {
				return;
			}
			this.method6899(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V")
	public void method6901() {
		this.anInt8086 = Class177.anIntArray360[this.anInt8089 << 3];
		@Pc(17) long local17 = (long) this.anInt8079;
		@Pc(21) long local21 = (long) this.anInt8078;
		@Pc(25) long local25 = (long) this.anInt8082;
		this.anInt8087 = (int) Math.sqrt((double) (local21 * local21 + local17 * local17 + local25 * local25));
		if (this.anInt8091 == 0) {
			this.anInt8091 = 1;
		}
		if (this.anInt8077 == 0) {
			this.aLong200 = 2147483647L;
		} else if (this.anInt8077 == 1) {
			this.aLong200 = this.anInt8087 * 8 / this.anInt8091;
			this.aLong200 *= this.aLong200;
		} else if (this.anInt8077 == 2) {
			this.aLong200 = this.anInt8087 * 8 / this.anInt8091;
		}
		if (this.aBoolean574) {
			this.anInt8087 *= -1;
		}
	}
}
