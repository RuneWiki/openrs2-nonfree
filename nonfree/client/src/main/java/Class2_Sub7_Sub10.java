import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public final class Class2_Sub7_Sub10 extends Class2_Sub7 {

	@OriginalMember(owner = "client!jj", name = "D", descriptor = "[Lclient!os;")
	public Class176[] aClass176Array1;

	@OriginalMember(owner = "client!jj", name = "E", descriptor = "[[B")
	private byte[][] aByteArrayArray13;

	@OriginalMember(owner = "client!jj", name = "y", descriptor = "I")
	private final int anInt3387;

	static {
		new Class62("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
	}

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(I)V")
	public Class2_Sub7_Sub10(@OriginalArg(0) int arg0) {
		this.anInt3387 = arg0;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IB)Z")
	public boolean method2904(@OriginalArg(0) int arg0) {
		return this.aClass176Array1[arg0].aBoolean358;
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)Z")
	public boolean method2908() {
		if (this.aClass176Array1 != null) {
			return true;
		}
		@Pc(42) int local42;
		if (this.aByteArrayArray13 == null) {
			if (!Static233.aClass83_83.method1978(this.anInt3387)) {
				return false;
			}
			@Pc(35) int[] local35 = Static233.aClass83_83.method1965(this.anInt3387);
			this.aByteArrayArray13 = new byte[local35.length][];
			for (local42 = 0; local42 < local35.length; local42++) {
				this.aByteArrayArray13[local42] = Static233.aClass83_83.method1968(local35[local42], this.anInt3387);
			}
		}
		@Pc(63) boolean local63 = true;
		@Pc(86) int local86;
		for (local42 = 0; local42 < this.aByteArrayArray13.length; local42++) {
			@Pc(72) byte[] local72 = this.aByteArrayArray13[local42];
			local86 = (local72[0] & 0xFF) << 8 | local72[1] & 0xFF;
			local63 &= Static77.aClass83_36.method1958(local86);
		}
		if (!local63) {
			return false;
		}
		@Pc(107) Class238 local107 = new Class238();
		local86 = Static233.aClass83_83.method1955(this.anInt3387);
		this.aClass176Array1 = new Class176[local86];
		@Pc(123) int[] local123 = Static233.aClass83_83.method1965(this.anInt3387);
		for (@Pc(125) int local125 = 0; local125 < local123.length; local125++) {
			@Pc(132) byte[] local132 = this.aByteArrayArray13[local125];
			@Pc(146) int local146 = local132[1] & 0xFF | (local132[0] & 0xFF) << 8;
			@Pc(148) Class2_Sub42 local148 = null;
			for (@Pc(153) Class2_Sub42 local153 = (Class2_Sub42) local107.method5795(); local153 != null; local153 = (Class2_Sub42) local107.method5799()) {
				if (local153.anInt7021 == local146) {
					local148 = local153;
					break;
				}
			}
			if (local148 == null) {
				local148 = new Class2_Sub42(local146, Static77.aClass83_36.method1979(local146));
				local107.method5796(local148);
			}
			this.aClass176Array1[local123[local125]] = new Class176(local132, local148);
		}
		this.aByteArrayArray13 = null;
		return true;
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(IB)Z")
	public boolean method2909(@OriginalArg(0) int arg0) {
		return this.aClass176Array1[arg0].aBoolean357;
	}
}
