import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class120 {

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
	public int anInt3014;

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
	private int anInt3015;

	static {
		new Class15("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)I")
	public int method2297() {
		return this.anInt3014 & 0x3FFF;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IZII)Z")
	public boolean method2299(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt3015;
		if (arg0 == this.anInt3014 && this.anInt3015 == 0) {
			return false;
		}
		@Pc(66) boolean local66;
		@Pc(102) int local102;
		if (this.anInt3015 == 0) {
			if (this.anInt3014 < arg0 && arg2 + this.anInt3014 >= arg0 || this.anInt3014 > arg0 && this.anInt3014 - arg2 <= arg0) {
				this.anInt3014 = arg0;
				return false;
			}
			local66 = true;
		} else {
			@Pc(108) int local108;
			if (this.anInt3015 > 0 && arg0 > this.anInt3014) {
				local102 = this.anInt3015 * this.anInt3015 / (arg2 * 2);
				local108 = this.anInt3014 + local102;
				if (arg0 > local108 && local108 >= this.anInt3014) {
					local66 = true;
				} else {
					local66 = false;
				}
			} else if (this.anInt3015 < 0 && arg0 < this.anInt3014) {
				local102 = this.anInt3015 * this.anInt3015 / (arg2 * 2);
				local108 = this.anInt3014 - local102;
				if (arg0 < local108 && this.anInt3014 >= local108) {
					local66 = true;
				} else {
					local66 = false;
				}
			} else {
				local66 = false;
			}
		}
		if (local66) {
			if (this.anInt3014 < arg0) {
				this.anInt3015 += arg2;
				if (arg1 != 0 && this.anInt3015 > arg1) {
					this.anInt3015 = arg1;
				}
			} else {
				this.anInt3015 -= arg2;
				if (arg1 != 0 && -arg1 > this.anInt3015) {
					this.anInt3015 = -arg1;
				}
			}
			if (this.anInt3015 != local8) {
				local102 = this.anInt3015 * this.anInt3015 / (arg2 * 2);
				if (arg0 > this.anInt3014) {
					if (arg0 < this.anInt3014 + local102) {
						this.anInt3015 = local8;
					}
				} else if (this.anInt3014 > arg0 && this.anInt3014 - local102 < arg0) {
					this.anInt3015 = local8;
				}
			}
		} else if (this.anInt3015 <= 0) {
			this.anInt3015 += arg2;
			if (this.anInt3015 > 0) {
				this.anInt3015 = 0;
			}
		} else {
			this.anInt3015 -= arg2;
			if (this.anInt3015 < 0) {
				this.anInt3015 = 0;
			}
		}
		this.anInt3014 += local8 + this.anInt3015 >> 1;
		return local66;
	}

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "(B)V")
	public void method2301() {
		this.anInt3014 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)V")
	public void method2302(@OriginalArg(1) int arg0) {
		this.anInt3014 = arg0;
		this.anInt3015 = 0;
	}
}
