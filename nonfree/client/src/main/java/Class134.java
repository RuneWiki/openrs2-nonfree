import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class134 {

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
	private int anInt3619;

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
	public int anInt3621;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)I")
	public int method3097() {
		return this.anInt3621 & 0x3FFF;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIII)Z")
	public boolean method3098(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = this.anInt3619;
		if (arg2 == this.anInt3621 && this.anInt3619 == 0) {
			return false;
		}
		@Pc(51) boolean local51;
		@Pc(73) int local73;
		if (this.anInt3619 == 0) {
			if (arg2 > this.anInt3621 && arg2 <= this.anInt3621 + arg1 || arg2 < this.anInt3621 && this.anInt3621 - arg1 <= arg2) {
				this.anInt3621 = arg2;
				return false;
			}
			local51 = true;
		} else {
			@Pc(78) int local78;
			if (this.anInt3619 > 0 && this.anInt3621 < arg2) {
				local73 = this.anInt3619 * this.anInt3619 / (arg1 * 2);
				local78 = this.anInt3621 + local73;
				if (arg2 > local78 && local78 >= this.anInt3621) {
					local51 = true;
				} else {
					local51 = false;
				}
			} else if (this.anInt3619 < 0 && arg2 < this.anInt3621) {
				local73 = this.anInt3619 * this.anInt3619 / (arg1 * 2);
				local78 = this.anInt3621 - local73;
				if (arg2 < local78 && this.anInt3621 >= local78) {
					local51 = true;
				} else {
					local51 = false;
				}
			} else {
				local51 = false;
			}
		}
		if (local51) {
			if (arg2 > this.anInt3621) {
				this.anInt3619 += arg1;
				if (arg0 != 0 && arg0 < this.anInt3619) {
					this.anInt3619 = arg0;
				}
			} else {
				this.anInt3619 -= arg1;
				if (arg0 != 0 && -arg0 > this.anInt3619) {
					this.anInt3619 = -arg0;
				}
			}
			if (local8 != this.anInt3619) {
				local73 = this.anInt3619 * this.anInt3619 / (arg1 * 2);
				if (this.anInt3621 >= arg2) {
					if (this.anInt3621 > arg2 && this.anInt3621 - local73 < arg2) {
						this.anInt3619 = local8;
					}
				} else if (this.anInt3621 + local73 > arg2) {
					this.anInt3619 = local8;
				}
			}
		} else if (this.anInt3619 > 0) {
			this.anInt3619 -= arg1;
			if (this.anInt3619 < 0) {
				this.anInt3619 = 0;
			}
		} else {
			this.anInt3619 += arg1;
			if (this.anInt3619 > 0) {
				this.anInt3619 = 0;
			}
		}
		this.anInt3621 += this.anInt3619 + local8 >> 1;
		return local51;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZ)V")
	public void method3099(@OriginalArg(0) int arg0) {
		this.anInt3621 = arg0;
		this.anInt3619 = 0;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
	public void method3100() {
		this.anInt3621 &= 0x3FFF;
	}
}
