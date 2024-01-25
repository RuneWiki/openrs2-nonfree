import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vba")
public final class Class351 {

	@OriginalMember(owner = "client!vba", name = "b", descriptor = "I")
	public int anInt10057;

	@OriginalMember(owner = "client!vba", name = "c", descriptor = "I")
	public int anInt10058;

	@OriginalMember(owner = "client!vba", name = "d", descriptor = "I")
	public int anInt10059;

	@OriginalMember(owner = "client!vba", name = "g", descriptor = "I")
	public int anInt10061;

	@OriginalMember(owner = "client!vba", name = "h", descriptor = "I")
	public int anInt10062;

	@OriginalMember(owner = "client!vba", name = "i", descriptor = "I")
	public int anInt10063;

	@OriginalMember(owner = "client!vba", name = "p", descriptor = "I")
	private int anInt10067;

	@OriginalMember(owner = "client!vba", name = "q", descriptor = "I")
	public int anInt10068;

	@OriginalMember(owner = "client!vba", name = "s", descriptor = "I")
	public int anInt10070;

	@OriginalMember(owner = "client!vba", name = "v", descriptor = "I")
	public int anInt10072;

	@OriginalMember(owner = "client!vba", name = "z", descriptor = "J")
	public long aLong266;

	@OriginalMember(owner = "client!vba", name = "l", descriptor = "I")
	public int anInt10065 = 0;

	@OriginalMember(owner = "client!vba", name = "f", descriptor = "I")
	public int anInt10060 = 0;

	@OriginalMember(owner = "client!vba", name = "t", descriptor = "Z")
	private boolean aBoolean713 = false;

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(Lclient!ig;I)V")
	public void method8156(@OriginalArg(0) Class8_Sub8 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8525();
			if (local5 == 0) {
				return;
			}
			this.method8158(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(Lclient!ig;II)V")
	private void method8158(@OriginalArg(0) Class8_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt10067 = arg0.method8578();
		} else if (arg1 == 2) {
			arg0.method8525();
		} else if (arg1 == 3) {
			this.anInt10057 = arg0.method8540();
			this.anInt10070 = arg0.method8540();
			this.anInt10059 = arg0.method8540();
		} else if (arg1 == 4) {
			this.anInt10062 = arg0.method8525();
			this.anInt10058 = arg0.method8540();
		} else if (arg1 == 6) {
			this.anInt10068 = arg0.method8525();
		} else if (arg1 == 8) {
			this.anInt10065 = 1;
		} else if (arg1 == 9) {
			this.anInt10060 = 1;
		} else if (arg1 == 10) {
			this.aBoolean713 = true;
		}
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(B)V")
	public void method8159() {
		this.anInt10061 = Class344.anIntArray578[this.anInt10067 << 3];
		@Pc(21) long local21 = (long) this.anInt10057;
		@Pc(25) long local25 = (long) this.anInt10070;
		@Pc(29) long local29 = (long) this.anInt10059;
		this.anInt10063 = (int) Math.sqrt((double) (local21 * local21 + local25 * local25 + local29 * local29));
		if (this.anInt10058 == 0) {
			this.anInt10058 = 1;
		}
		if (this.anInt10062 == 0) {
			this.aLong266 = 2147483647L;
		} else if (this.anInt10062 == 1) {
			this.aLong266 = this.anInt10063 * 8 / this.anInt10058;
			this.aLong266 *= this.aLong266;
		} else if (this.anInt10062 == 2) {
			this.aLong266 = this.anInt10063 * 8 / this.anInt10058;
		}
		if (this.aBoolean713) {
			this.anInt10063 *= -1;
		}
	}
}
